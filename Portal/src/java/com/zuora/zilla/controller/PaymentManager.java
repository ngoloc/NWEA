package com.zuora.zilla.controller;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.DeleteResult;
import com.zuora.api.ID;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Payment;
import com.zuora.zilla.model.ResponseAction;
import com.zuora.zilla.model.SummaryPayment;
import com.zuora.zilla.util.ZApi;
import com.zuora.zilla.util.ZuoraUtility;
import org.apache.axis.encoding.Base64;
import org.springframework.cache.Cache;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * The PaymentManager class manages existing PaymentMethods, and create source
 * URLs to generate Iframes to enter new credit cards.
 *
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class PaymentManager {

    private ZuoraRepository zr;

    public PaymentManager(Cache cache) throws Exception {
        this(new ZuoraRepository(cache));
    }

    public PaymentManager(ZuoraRepository zr) throws Exception {
        this.zr = zr;
    }

    /**
     * Generates a URL for a new subscriber to enter credit card and contact
     * information.
     *
     * @return New PaymentMethod URL
     */
    public ResponseAction getNewAccountUrl() {
        return generateUrl();
    }

    /**
     * Generates a URL for an existing subscriber to enter an additional credit
     * card. Uses the current logged in User's accountId to attach the payment
     * method to their account upon submission.
     *
     * @return Existing PaymentMethod URL
     * @throws Exception
     * @author Eric Neto
     */
    public ResponseAction getExistingIframeSrc(String accountName)
            throws Exception {
        ResponseAction resp = new ResponseAction();
        String iframeUrl = null;

        ZApi zapi = null;
        try {
            zapi = new ZApi();
        } catch (Exception e) {
            resp.setSuccess(false);
            resp.setError(e.getMessage());
            return resp;
        }

        Contact contact = null;
        Account acc = zr.AccountR.GetByName(accountName);

        if (acc == null) {
            return null; // ACCOUNT_DOES_NOT_EXIST
        }
        String accountId = acc.getId().getID();

        Contact[] contacts = zr.ContactR.GetByAccountId(accountId);
        contact = contacts[0];

        // Get the base url
        ResponseAction baseResp = generateUrl();
        if (!baseResp.isSuccess())
            return baseResp;
        iframeUrl = baseResp.getData();

        // Append information from existing customer
        iframeUrl += "&field_accountId=" + contact.getAccountId();

        if (contact.getCountry() != null) {
            if (contact.getCountry().equalsIgnoreCase("united states")) {
                iframeUrl += "&field_creditCardCountry=USA";
            } else if (contact.getCountry().equalsIgnoreCase("canada")) {
                iframeUrl += "&field_creditCardCountry=CAN";
            }
        }

        iframeUrl += (contact.getState() != null) ? "&field_creditCardState="
                + contact.getState() : "";
        iframeUrl += (contact.getCity() != null) ? "&field_creditCardCity="
                + contact.getCity() : "";
        iframeUrl += (contact.getPostalCode() != null) ? "&field_creditCardPostalCode="
                + contact.getPostalCode()
                : "";
        iframeUrl += (contact.getAddress1() != null) ? "&field_creditCardAddress1="
                + contact.getAddress1()
                : "";
        iframeUrl += (contact.getAddress2() != null) ? "&field_creditCardAddress2="
                + contact.getAddress2()
                : "";
        iframeUrl += (contact.getWorkPhone() != null) ? "&field_phone="
                + contact.getWorkPhone() : "";
        iframeUrl += (contact.getWorkEmail() != null) ? "&field_email="
                + contact.getWorkEmail() : "";

        resp.setSuccess(true);
        resp.setData(iframeUrl);
        return resp;
    }

    /**
     * Used to generate the Base URL for both Existing and New accounts, using
     * the configured Z-Payments Page information.
     *
     * @return Base HPM URL
     */
    private ResponseAction generateUrl() {
        ResponseAction resp = new ResponseAction();

        String iframeUrl = null;

        // Get infos from properties file
        ZuoraUtility utility = new ZuoraUtility();
        String pageId = utility.getPageId();
        String tenantId = utility.getTenantId();
        String apiSecurityKey = utility.getAPISecurityKey();
        String appUrl = utility.getZuoraAppUrl();

        // generate random token
        String tokenBound = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        int len = tokenBound.length();
        for (int i = 0; i < 32; i++) {
            sb.append(tokenBound.charAt(r.nextInt(len)));
        }
        // end generate random token

        String token = sb.toString();

        String queryString = "id=" + pageId + "&" + "tenantId=" + tenantId
                + "&" + "timestamp=" + new java.util.Date().getTime() + "&"
                + "token=" + token;

        // Concatenate API security key with query string
        String queryStringToHash = queryString + apiSecurityKey;
        try {
            // Get UTF8 bytes
            byte[] queryStringToSignInBytes = queryStringToHash
                    .getBytes("UTF-8");
            // Create MD5 hash
            MessageDigest md5Digester = MessageDigest.getInstance("MD5");
            byte[] hashedQueryString = md5Digester
                    .digest(queryStringToSignInBytes);

            // Convert to hex
            String hashedStringInHex = new java.math.BigInteger(1,
                    hashedQueryString).toString(16);
            while (hashedStringInHex.length() < 32) {
                hashedStringInHex = "0" + hashedStringInHex;
            }

            // encode to Base64
            String hashedQueryStringBase64ed = Base64.encode(hashedStringInHex
                    .getBytes());
            // URL safe the signature
            hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('+',
                    '-');
            hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('/',
                    '_');

            // formulate the URL
            iframeUrl = appUrl + "/apps/PublicHostedPaymentMethodPage.do?"
                    + "method=requestPage&" + queryString + "&" + "signature="
                    + hashedQueryStringBase64ed;
            resp.setSuccess(true);
            resp.setData(iframeUrl);
        } catch (Exception e) {
            resp.setSuccess(false);
            resp.setError(e.getMessage());
        }

        return resp;
    }

    /**
     * Sets the default payment method of the logged in user to a different
     * payment method on their account.
     *
     * @param $pmId ID of new active payment method
     * @throws Exception
     */
    public ResponseAction changePaymentMethod(String accountName, String pmId)
            throws Exception {
        ResponseAction resp = new ResponseAction();

        if (pmId == null) {
            resp.setSuccess(false);
            resp.setError("NULL_PM_ID");
            return resp;
        }

        Account account = new Account();
        ID accIdd = new ID();
        String id = zr.AccountR.GetIdByName(accountName);
        accIdd.setID(id);
        account.setId(accIdd);
        ID pmIdd = new ID();
        pmIdd.setID(pmId);
        account.setDefaultPaymentMethodId(pmIdd);
        zr.AccountR.Update(account);
        return resp;
    }

    /**
     * Deletes the selected payment method from the logged in user's account.
     *
     * @param accountName This should be the name of the logged in user, passed in to
     *                    verify that the current usable is allowed to delete this
     *                    payment method
     * @param $pmId       ID of payment method to be removed
     */
    public ResponseAction removePaymentMethod(String accountName, String pmId) {
        ResponseAction resp = new ResponseAction();

        if (pmId == null) {
            resp.setSuccess(false);
            resp.setError("NULL_PM_ID");
            return resp;
        }

        ZApi zapi = null;
        try {
            zapi = new ZApi();
        } catch (Exception e) {
            resp.setSuccess(false);
            resp.setError("INVALID_LOGIN");
            return resp;
        }

        try {
            // TODO: Validate this payment method is owned by the account passed
            // in
            ID pmidd = new ID();
            pmidd.setID(pmId);
            DeleteResult[] delRes = zapi.zDelete(new ID[]{pmidd},
                    "PaymentMethod");
            if (delRes[0].getSuccess()) {
                resp.setSuccess(true);
                return resp;
            } else {
                resp.setSuccess(false);
                resp.setError(delRes[0].getErrors()[0].getMessage());
                return resp;
            }
        } catch (Exception e) {
            resp.setSuccess(false);
            resp.setError(e.getMessage());
            return resp;
        }
    }

    /**
     * Return a summary of the latest payments
     *
     * @param accountName Account from where to retrieve the payments
     * @param maxPayment  Maximum number of payments to return
     * @return List of payments
     * @throws Exception
     */
    public List<SummaryPayment> getLatestPayment(String accountName,
                                                 int maxPayment) throws Exception {

        // Step #1: get the associated account Id
        String accountId = null;

        Account account = zr.AccountR.GetByName(accountName);

        if (account == null)
            return null; // ACCOUNT_DOES_NOT_EXIST
        accountId = account.getId().getID();
        // Step #2: get all payments associated with this account ID
        Payment[] payments = zr.PaymentR.GetByAccountId(accountId);

        List<Payment> lPayments = new ArrayList<Payment>();

        for (Payment p : payments) {
            lPayments.add(p);
        }

        // Sort the payments by effective date DESC
        if (lPayments.size() > 0) {
            Collections.sort(lPayments, new CmpPayments());
            Collections.reverse(lPayments);
        }

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        // Step #3: Convert these ZObject into SummaryPayment
        List<SummaryPayment> lSummaryPayments = new ArrayList<SummaryPayment>();

        for (Payment p : lPayments) {
            SummaryPayment sp = new SummaryPayment();
            sp.setDate(df.format(p.getEffectiveDate().getTime()));
            sp.setId(p.getId().getID());
            sp.setPaymentApplied(p.getAmount().toPlainString());
            sp.setStatus(p.getStatus());
            sp.setType(p.getType());
            lSummaryPayments.add(sp);
        }

        if (lSummaryPayments.size() > maxPayment)
            return lSummaryPayments.subList(0, maxPayment);
        else
            return lSummaryPayments;
    }

    /**
     * Comparator to sort payments by effective date
     */
    private class CmpPayments implements Comparator<Payment> {

        public int compare(Payment a, Payment b) {
            return a.getEffectiveDate().compareTo(b.getEffectiveDate());
        }

    }
}