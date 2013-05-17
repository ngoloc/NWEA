package com.zuora.zilla.controller;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.ID;
import com.zuora.api.object.*;
import com.zuora.zilla.model.PaymentDetail;
import com.zuora.zilla.model.ResponseAction;
import com.zuora.zilla.model.SummaryAccount;
import com.zuora.zilla.model.SummaryContact;
import org.springframework.cache.Cache;

import java.util.*;

public class AccountManager {

    private ZuoraRepository zr;

    private PaymentManager paymentManager;

    private InvoiceManager invoiceManager;

    public AccountManager(ZuoraRepository zr) throws Exception {
        this.zr = zr;
        paymentManager = new PaymentManager(zr);
        invoiceManager = new InvoiceManager(zr);
    }

    public AccountManager(Cache c) throws Exception {
        this(new ZuoraRepository(c));
    }

    public SummaryAccount getCompleteDetail(String accountid)
            throws Exception {
        // Create the object and get the basic information
        SummaryAccount accountSummary = new SummaryAccount();

        Account acc = zr.AccountR.GetById(accountid);

        // Get Account Information
        accountSummary.setName(acc.getName());
        accountSummary.setBalance(acc.getBalance());
        accountSummary.setLastInvoiceDate(acc.getLastInvoiceDate());
        ID defaultPmIdd = acc.getDefaultPaymentMethodId();

        Payment[] payments = zr.PaymentR.GetByAccountId(acc.getId().getID());
        if (payments.length == 0) {
            accountSummary.setLastPaymentDate(null);
            accountSummary.setLastInvoiceDate(null);
        } else {
            // Sort payments by date
            List<Payment> listPayments = Arrays.asList(payments);
            Collections.sort(listPayments, new CmpPayments());
            Payment lastPayment = listPayments.get(0);
            accountSummary.setLastPaymentDate(lastPayment.getEffectiveDate());
            accountSummary.setLastPaymentAmount(lastPayment.getAmount());
        }
        // Get Contact with this email
        SummaryContact contactSummary = new SummaryContact();
        Contact cont = zr.ContactR.GetById(acc.getBillToId().getID());
        contactSummary.setId(cont.getId().getID());
        contactSummary.setFirstName(cont.getFirstName());
        contactSummary.setLastName(cont.getLastName());
        contactSummary.setCountry(cont.getCountry());
        contactSummary.setState(cont.getState());
        contactSummary.setAddress1(cont.getAddress1());
        contactSummary.setAddress2(cont.getAddress2());
        contactSummary.setCity(cont.getCity());
        contactSummary.setPostalCode(cont.getPostalCode());

        contactSummary.setSuccess(true);

        accountSummary.setContactSummary(contactSummary);

        // Get the sold to contact Id from this account
        SummaryContact soldTocontactSummary = new SummaryContact();
        Contact cont2 = zr.ContactR.GetById(acc.getSoldToId().getID());
        soldTocontactSummary.setId(cont2.getId().getID());
        soldTocontactSummary.setFirstName(cont2.getFirstName());
        soldTocontactSummary.setLastName(cont2.getLastName());
        soldTocontactSummary.setCountry(cont2.getCountry());
        soldTocontactSummary.setState(cont2.getState());
        soldTocontactSummary.setAddress1(cont2.getAddress1());
        soldTocontactSummary.setAddress2(cont2.getAddress2());
        soldTocontactSummary.setCity(cont2.getCity());
        soldTocontactSummary.setPostalCode(cont2.getPostalCode());

        soldTocontactSummary.setSuccess(true);

        accountSummary.setSoldToContactSummary(soldTocontactSummary);

        // Get payment methods with this account id
        ArrayList<PaymentDetail> paymentSummaries = new ArrayList<PaymentDetail>();

        PaymentMethod[] paymentMethods = zr.PaymentMethodR.GetByAccountId(acc
                .getId().getID());
        for (PaymentMethod pm : paymentMethods) {
            PaymentDetail d = new PaymentDetail();
            d.setId(pm.getId().getID());
            d.setCardHolderName(pm.getCreditCardHolderName());
            d.setMaskedNumber(pm.getCreditCardMaskNumber());
            d.setExpirationYear(pm.getCreditCardExpirationYear());
            d.setExpirationMonth(pm.getCreditCardExpirationMonth());
            d.setCardType(pm.getCreditCardType());
            if (defaultPmIdd != null) {
                d.setIsDefault((pm.getId().equals(defaultPmIdd.getID())));
            } else {
                d.setIsDefault(false);
            }
            paymentSummaries.add(d);
        }
        accountSummary.setPaymentMethodSummaries(paymentSummaries);

        // Get the latest invoices
        accountSummary.setInvoiceSummaries(this.invoiceManager.getLatestInvoices(accountid, 3));

        // Get the latest payments
        accountSummary.setPaymentSummaries(paymentManager.getLatestPayment(
                accountid, 10));

        accountSummary.setSuccess(true);
        return accountSummary;
    }

    public SummaryAccount getPaymentMethodDetail(String accountid)
            throws Exception {
        // Create the object and get the basic information
        SummaryAccount accountSummary = new SummaryAccount();

        Account acc = zr.AccountR.GetById(accountid);
        ID defaultPaymentMethodId = acc.getDefaultPaymentMethodId();

        Payment[] payments = zr.PaymentR.GetByAccountId(acc.getId().getID());

        if (payments.length == 0) {
            accountSummary.setLastPaymentDate(null);
            accountSummary.setLastInvoiceDate(null);
        } else {
            // Sort payments by date
            List<Payment> listPayments = Arrays.asList(payments);
            Collections.sort(listPayments, new CmpPayments());
            Payment lastPayment = (Payment) listPayments;
            accountSummary.setLastPaymentDate(lastPayment.getEffectiveDate());
            accountSummary.setLastPaymentAmount(lastPayment.getAmount());
        }

        // Get payment methods with this account id
        ArrayList<PaymentDetail> paymentSummaries = new ArrayList<PaymentDetail>();

        PaymentMethod[] paymentMethods = zr.PaymentMethodR.GetByAccountId(acc
                .getId().getID());

        for (PaymentMethod pm : paymentMethods) {
            PaymentDetail d = new PaymentDetail();
            d.setId(pm.getId().getID());
            d.setCardHolderName(pm.getCreditCardHolderName());
            d.setMaskedNumber(pm.getCreditCardMaskNumber());
            d.setExpirationYear(pm.getCreditCardExpirationYear());
            d.setExpirationMonth(pm.getCreditCardExpirationMonth());
            d.setCardType(pm.getCreditCardType());
            if (defaultPaymentMethodId != null) {

                String pmId = pm.getId().getID();
                String defPmId = defaultPaymentMethodId.getID();

                d.setIsDefault(pmId.equals(defPmId));
            } else {
                d.setIsDefault(false);
            }
            paymentSummaries.add(d);
        }
        accountSummary.setPaymentMethodSummaries(paymentSummaries);

        accountSummary.setSuccess(true);
        return accountSummary;
    }

    /**
     * Update the given user's information
     *
     * @return the user ID if successful
     * @throws Exception
     */
    public ResponseAction updateContact(String accountName,
                                        SummaryContact updatedContact) throws Exception {

        ResponseAction contactResult = new ResponseAction();

        // Get Account ID with this name
        String accountId = null;
        Account acc = zr.AccountR.GetByName(accountName);
        accountId = acc.getId().getID();

        // Get the contact ID associated with this account
        Contact[] contacts = zr.ContactR.GetByAccountId(accountId);
        Contact contact = contacts[0];

        // Create a contact record with this ID and all parameters that were
        // passed in
        Contact updated = new Contact();
        updated.setId(contact.getId());

        if (updatedContact.getFirstName() != null)
            updated.setFirstName(updatedContact.getFirstName());
        if (updatedContact.getLastName() != null)
            updated.setLastName(updatedContact.getLastName());
        if (updatedContact.getCountry() != null)
            updated.setCountry(updatedContact.getCountry());
        if (updatedContact.getAddress1() != null)
            updated.setAddress1(updatedContact.getAddress1());
        if (updatedContact.getAddress2() != null)
            updated.setAddress2(updatedContact.getAddress2());
        if (updatedContact.getPostalCode() != null)
            updated.setPostalCode(updatedContact.getPostalCode());
        if (updatedContact.getCity() != null)
            updated.setCity(updatedContact.getCity());
        if (updatedContact.getState() != null)
            updated.setState(updatedContact.getState());

        zr.ContactR.Update(updated);
        contactResult.setSuccess(true);

        return contactResult;
    }

    public ResponseAction updateContactWithId(String contactId,
                                              SummaryContact contact) throws Exception {

        ResponseAction contactResult = new ResponseAction();

        // Create a contact object from this summary
        Contact c = new Contact();
        ID cid = new ID();
        cid.setID(contact.getId());
        c.setId(cid);
        c.setFirstName(contact.getFirstName());
        c.setLastName(contact.getLastName());
        c.setAddress1(contact.getAddress1());
        c.setAddress2(contact.getAddress2());
        c.setCity(contact.getCity());
        c.setPostalCode(contact.getPostalCode());
        c.setCountry(contact.getCountry());
        c.setState(contact.getState());

        zr.ContactR.Update(c);
        contactResult.setSuccess(true);
        return contactResult;
    }

    /**
     * Comparator to sort payments by effective date.
     */
    private class CmpPayments implements Comparator<ZObject> {

        public int compare(ZObject a, ZObject b) {
            return ((Payment) a).getCreatedDate().compareTo(
                    ((Payment) b).getCreatedDate());
        }

    }

    public boolean checkEmailAvailability(String accountname) throws Exception {

        // Disallow apostrophes in account names
        if (accountname.contains("'")) {
            return false;
        }

        // Find any accounts with this account name'

        // Get Account ID with this name
        Account account = zr.AccountR.GetByName(accountname);
        return account == null;
    }

    public String getAccountNameForEmail(String email) throws Exception {

        if (checkEmailAvailability(email)) {
            return email;
        }

        Contact[] contacts = zr.ContactR.GetByEmail(email);
        if (contacts.length > 0) {
            String accountId = contacts[0].getAccountId().getID();
            Account acc = zr.AccountR.GetById(accountId);
            return acc.getName();
        }
        return null;
    }

}
