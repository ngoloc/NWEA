package com.zuora.zilla.controller;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.AccountSample;
import com.zuora.zilla.util.ZuoraUtility;
import org.springframework.cache.Cache;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class SubscriptionManager {

    private ZuoraRepository zrepo;

    private ZuoraUtility zuoraUtility;

    private AccountManager accountManager;

    public SubscriptionManager(Cache cache) throws Exception {
        zrepo = new ZuoraRepository(cache);
        zuoraUtility = new ZuoraUtility();
        accountManager = new AccountManager(zrepo);
    }

    /**
     * Retrieve all details of the current and removed rateplans on the logged
     * in user's subscription.
     *
     * @param userEmail User's given Email address
     * @return Active Subscription details
     * @throws Exception
     */
    public AmenderSubscription getCurrentSubscription(String accountName)
            throws Exception {
        // Get Active Subscription
        AmenderSubscription activeSubscription = new AmenderSubscription();

        // Step #1: get the associated account Id

        Account account = zrepo.AccountR.GetByName(accountName);
        String accountId = account.getId().getID();

        Subscription[] subscriptions = zrepo.SubscriptionR
                .GetSubscriptions(accountId);
        Subscription subscription = subscriptions[0];

        activeSubscription.setUserEmail(accountName);
        activeSubscription.setSubscriptionId(subscription.getId().getID());
        activeSubscription.setVersion(subscription.getVersion());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

        activeSubscription.setEndOfTermDate(Calendar.getInstance());
        activeSubscription.setStartDate(dateFormat.format(subscription
                .getTermStartDate().getTime()));

        // Prepare list of existing rate plan
        List<AmenderPlan> activePlans = new ArrayList<AmenderPlan>();
        List<AmenderPlan> removedPlans = new ArrayList<AmenderPlan>();

        // Get active rate plan
        RatePlan[] ratePlans = zrepo.RatePlanR.GetRatePlans(activeSubscription
                .getSubscriptionId());

        if (ratePlans.length > 0) {
            // Loop through all the rate plan
            for (RatePlan rp : ratePlans) {
                AmenderPlan newPlan = new AmenderPlan();

                newPlan.setId(rp.getId().getID());
                newPlan.setName(rp.getName());

                // Get product name
                ProductRatePlan curPrp = zrepo.ProductRatePlanR.GetById(rp
                        .getProductRatePlanId().getID());
                Product curProd = zrepo.ProductR.GetById(curPrp.getProductId()
                        .getID());

                newPlan.setDescription((curPrp.getDescription() != null) ? curPrp
                        .getDescription() : "");
                newPlan.setProductName(curProd.getName());

                // Get all charges
                List<AmenderCharge> charges = new ArrayList<AmenderCharge>();

                RatePlanCharge[] ratePlanCharges = zrepo.RatePlanChargeR
                        .GetByRatePlan(rp.getId().getID());
                for (RatePlanCharge rpc : ratePlanCharges) {
                    AmenderCharge newCharge = new AmenderCharge();

                    newCharge.setId(rpc.getId().getID());
                    newCharge.setName(rpc.getName());
                    newCharge.setChargeModel(rpc.getChargeModel());
                    newCharge.setProductRatePlanChargeId(rpc
                            .getProductRatePlanChargeId().getID());

                    if (!rpc.getChargeModel().equals("Flat Fee Pricing")
                            && !rpc.getChargeType().equals("Usage")) {
                        newPlan.setUom(rpc.getUOM());
                        newPlan.setQuantity(rpc.getQuantity().toPlainString());
                        newCharge.setUom(rpc.getUOM());
                        newCharge
                                .setQuantity(rpc.getQuantity().toPlainString());
                    }

                    // For all charges, find maximum ChargedThroughDate
                    if (rpc.getChargedThroughDate() != null) {
                        if (rpc.getChargedThroughDate().compareTo(
                                Calendar.getInstance()) > 0) {
                            activeSubscription.setEndOfTermDate(rpc
                                    .getChargedThroughDate());
                        }
                    }

                    charges.add(newCharge);
                }

                newPlan.setAmenderCharges(charges);
                activePlans.add(newPlan);
            }
        }

        RatePlan[] removedRatePlans = zrepo.RatePlanR
                .GetRemovedRatePlans(subscription.getId().getID());
        if (removedRatePlans.length > 0) {
            for (RatePlan rp : removedRatePlans) {
                AmenderPlan newPlan = new AmenderPlan();
                newPlan.setId(rp.getId().getID());
                newPlan.setName(rp.getName());

                ProductRatePlan curPrp = zrepo.ProductRatePlanR.GetById(rp
                        .getProductRatePlanId().getID());
                Product curProd = zrepo.ProductR.GetById(curPrp.getProductId()
                        .getID());

                newPlan.setDescription((curPrp.getDescription() != null) ? curPrp
                        .getDescription() : "");
                newPlan.setProductName(curProd.getName());

                newPlan.setAmendmentId(rp.getAmendmentId().getID());
                newPlan.setAmendmentType(rp.getAmendmentType());
                newPlan.setEffectiveDate("end of current billing period.");

                Amendment amd = zrepo.AmendmentR.GetById(newPlan
                        .getAmendmentId());
                newPlan.setEffectiveDate(dateFormat.format(amd
                        .getContractEffectiveDate().getTime()));

                // Get all charges
                List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
                RatePlanCharge[] ratePlanCharges = zrepo.RatePlanChargeR
                        .GetByRatePlan(rp.getId().getID());
                for (RatePlanCharge rpc : ratePlanCharges) {
                    AmenderCharge newCharge = new AmenderCharge();

                    newCharge.setId(rpc.getId().getID());
                    newCharge.setName(rpc.getName());
                    newCharge.setChargeModel(rpc.getChargeModel());
                    newCharge.setProductRatePlanChargeId(rpc
                            .getProductRatePlanChargeId().getID());

                    if (!rpc.getChargeModel().equals("Flat Fee Pricing")
                            && rpc.getChargeType() != "Usage") {
                        newPlan.setUom(rpc.getUOM());
                        newPlan.setQuantity(rpc.getQuantity().toPlainString());
                        newCharge.setUom(rpc.getUOM());
                        newCharge
                                .setQuantity(rpc.getQuantity().toPlainString());
                    }

                    // For all charges, find maximum ChargedThroughDate
                    if (rpc.getChargedThroughDate() != null) {
                        if (rpc.getChargedThroughDate().compareTo(
                                Calendar.getInstance()) > 0) {
                            activeSubscription.setEndOfTermDate(rpc
                                    .getChargedThroughDate());
                        }
                    }
                    charges.add(newCharge);
                }
                removedPlans.add(newPlan);
            }
        }

        activeSubscription.setActivePlans(activePlans);
        activeSubscription.setRemovedPlans(removedPlans);

        activeSubscription.setSuccess(true);
        return activeSubscription;
    }

    public ResponseSubscribe subscribeWithCurrentCart(String userEmail,
                                                      String pmId, CartHelper cartHelper) throws Exception {

        ResponseSubscribe data = new ResponseSubscribe();

        try {
            if (!accountManager.checkEmailAvailability(userEmail)) {
                data.setError("DUPLICATE_EMAIL");
                data.setSuccess(false);
                return data;
            }
        } catch (Exception e) {
            data.setError("INVALID_EMAIL");
            data.setSuccess(false);
            return data;
        }

        // Get Contact Information from newly created user
        PaymentMethod pm = zrepo.PaymentMethodR.GetById(pmId);
        String holderName = (pm.getCreditCardHolderName() != null) ? pm
                .getCreditCardHolderName() : "";

        // Derive first and last name from CardHolderName
        String firstName, lastName;

        if (holderName.contains(" ")) {
            String[] split = holderName.split("\\s+", 2);
            firstName = split[0];
            lastName = split[1];

        } else {
            firstName = holderName;
            lastName = "-";
        }

        // Populate the fields
        String address1 = (pm.getCreditCardAddress1() != null) ? pm
                .getCreditCardAddress1() : "";
        String address2 = (pm.getCreditCardAddress2() != null) ? pm
                .getCreditCardAddress2() : "";
        String city = (pm.getCreditCardCity() != null) ? pm.getCreditCardCity()
                : "";
        String country = (pm.getCreditCardCountry() != null) ? pm
                .getCreditCardCountry() : "";
        String postalCode = (pm.getCreditCardPostalCode() != null) ? pm
                .getCreditCardPostalCode() : "";
        String state = (pm.getCreditCardState() != null) ? pm
                .getCreditCardState() : "";
        String phone = (pm.getPhone() != null) ? pm.getPhone() : "";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        Calendar today = Calendar.getInstance();
        int mday = today.get(Calendar.DAY_OF_MONTH);

        ZuoraUtility zu = new ZuoraUtility();

        // Set up the account
        Account acc = new Account();
        acc.setAutoPay(zuoraUtility.getDefaultAutopay());
        acc.setCurrency(zuoraUtility.getDefaultCurrency());
        acc.setName(userEmail);
        acc.setPaymentTerm(zuoraUtility.getDefaultPaymentTerm());
        acc.setBatch(zuoraUtility.getDefaultBatch());
        acc.setBillCycleDay(mday);
        acc.setStatus("Active");

        // Set up contact
        Contact billToContact = new Contact();
        billToContact.setAddress1(address1);
        billToContact.setAddress2(address2);
        billToContact.setCity(city);
        billToContact.setFirstName(firstName);
        billToContact.setLastName(lastName);
        billToContact.setPostalCode(postalCode);
        billToContact.setState(state);
        billToContact.setWorkEmail(userEmail);
        billToContact.setWorkPhone(phone);
        billToContact.setCountry(country);

        // BEGIN CNET Custom dev
        Contact soldToContact = new Contact();
        soldToContact.setFirstName(firstName);
        soldToContact.setLastName(lastName);
        soldToContact.setCountry(country);
        soldToContact.setState(state);
        soldToContact.setPostalCode(postalCode);
        // END CNET Custom dev

        // Set up subscription
        SubscribeOptions subscribeOptions = new SubscribeOptions();
        subscribeOptions.setGenerateInvoice(true);
        subscribeOptions.setProcessPayments(true);

        PreviewOptions previewOptions = new PreviewOptions();
        previewOptions.setEnablePreviewMode(false);

        Subscription subscription = new Subscription();
        subscription.setContractEffectiveDate(today);
        subscription.setContractAcceptanceDate(today);
        subscription.setServiceActivationDate(today);
        subscription.setTermStartDate(today);
        subscription.setTermType("EVERGREEN");
        subscription.setRenewalTerm(12);

        if (subscription.getContractAcceptanceDate() != today) {
            data.setSuccess(false);
            data.setError("bad contract acceptance date");
            return data;
        }

        SubscriptionData subscriptionData = new SubscriptionData();
        RatePlanData[] rpd = SubscriptionManager
                .getSubscriptionDataRatePlanFromCart(cartHelper);
        subscriptionData.setRatePlanData(rpd);
        subscriptionData.setSubscription(subscription);

        // Create the subscription request
        SubscribeRequest subReq = new SubscribeRequest();
        subReq.setAccount(acc);
        subReq.setBillToContact(billToContact);
        subReq.setSoldToContact(soldToContact);
        subReq.setPaymentMethod(pm);
        subReq.setSubscribeOptions(subscribeOptions);
        subReq.setPreviewOptions(previewOptions);
        subReq.setSubscriptionData(subscriptionData);

        SubscribeRequest[] subscribes = new SubscribeRequest[1];
        subscribes[0] = subReq;
        // Do the subscription with Zuora API
        SubscribeResult[] resp = null;
        Subscribe subc = new Subscribe();
        subc.setSubscribes(subscribes);
        resp = zrepo.SubscriptionR.DoSubscribe(subc);
        if (resp[0].getSuccess()) {
            data.setSubscriptionId(resp[0].getSubscriptionId().getID());
            data.setSuccess(true);
        } else {
            data.setError(resp[0].getErrors()[0].getMessage());
            data.setSuccess(false);
        }
        return data;
    }

    /**
     * Creates dummy subscription with current cart, used to determine the value
     * of the first invoice.
     *
     * @return SubscribeResult with preview information
     * @throws Exception
     * @throws UnexpectedErrorFault
     * @throws RemoteException
     * @author Eric Neto
     */
    public SubscribePreview previewCurrentCart(CartHelper cartHelper) throws Exception {
        SubscribePreview preview = new SubscribePreview();

        // If Cart is empty, return an empty cart message
        if (cartHelper.getCartItems().size() == 0) {
            preview.invoiceAmount = 0.00;
            preview.success = false;
            preview.error = "EMPTY_CART";
            return preview;
        }

        // Get the data from the sample (in order to preview from a 'fake'
        // account)
        Account account = AccountSample.makeAccount();
        Contact billingContact = AccountSample.makeContact();
        SubscribeOptions subscribeOptions = AccountSample
                .makeSubscriptionOptions();
        PreviewOptions previewOptions = AccountSample.makePreviewOptions();

        // Set up subscription
        Subscription subscription = SubscriptionManager.makeSubscription();
        SubscriptionData subscriptionData = new SubscriptionData();
        try {
            RatePlanData[] rpd = SubscriptionManager
                    .getSubscriptionDataRatePlanFromCart(cartHelper);
            subscriptionData.setRatePlanData(rpd);
        } catch (Exception e) {
            preview.setSuccess(false);
            preview.setError(e.getMessage());
            return preview;
        }
        subscriptionData.setSubscription(subscription);

        // Create the subscription request
        SubscribeRequest subReq = new SubscribeRequest();
        subReq.setAccount(account);
        subReq.setBillToContact(billingContact);
        subReq.setSubscribeOptions(subscribeOptions);
        subReq.setPreviewOptions(previewOptions);
        subReq.setSubscriptionData(subscriptionData);

        SubscribeRequest[] subscribes = new SubscribeRequest[1];
        subscribes[0] = subReq;

        // Do the subscription with Zuora API
        Subscribe subc = new Subscribe();
        subc.setSubscribes(subscribes);
        SubscribeResult[] resps = zrepo.SubscriptionR.DoSubscribe(subc);
        SubscribeResult resp = resps[0];
        if (resp.getSuccess()) {
            if (resp.getInvoiceData() != null) {
                // For a successful preview with invoice, return the amount.
                preview.setInvoiceAmount(resp.getInvoiceData()[0].getInvoice()
                        .getAmount().doubleValue());
                preview.setSuccess(true);
            } else {
                // For a successful preview with a zero-dollar invvoice, return
                // 0.00.
                preview.setInvoiceAmount(0.00);
                preview.setSuccess(true);
            }
        } else {
            // For an unsuccessful preview, return an appropriate error.
            preview.setSuccess(false);
            String errorResponse = resp.getErrors()[0].getMessage();
            if (errorResponse.contains("ProductRatePlanId is invalid")) {
                preview.setError("RATE_PLAN_DOESNT_EXIST");
            } else if (errorResponse.contains("RatePlan is out of date.")) {
                preview.setError("RATE_PLAN_EXPIRED");
            } else {
                preview.setError(errorResponse);
            }
        }
        return preview;
    }

    /**
     * Make the current subscription
     *
     * @return the subscription
     */
    private static Subscription makeSubscription() {
        Subscription subscription = new Subscription();
        subscription
                .setContractEffectiveDate(ZuoraUtility.getCurrentCalendar());
        subscription.setTermStartDate(ZuoraUtility.getCurrentCalendar());
        subscription.setTermType("EVERGREEN");
        subscription.setStatus("Active");
        return subscription;
    }

    /**
     * Assembles RatePlan information by pulling all rate plans in the user's
     * current cart
     *
     * @param cartHelper the current cart (from HttpSession and the web client)
     * @return RatePlanData for subscribe
     * @throws Exception
     */
    private static RatePlanData[] getSubscriptionDataRatePlanFromCart(
            CartHelper cartHelper) throws Exception {
        // Create the return object
        ArrayList<RatePlanData> rpds = new ArrayList<RatePlanData>();

        // Loop for each item in the current cart
        for (CartItem cartItem : cartHelper.getCartItems()) {
            // Create and populate the Rate Plan Data to be included in the
            // current subscription
            RatePlanData ratePlanData = new RatePlanData();

            // Parameters for the current Rate Plan
            RatePlan ratePlan = new RatePlan();
            ratePlanData.setRatePlan(ratePlan);

            // Get the ID of the current product rate plan
            String productRatePlanId = cartItem.getRatePlanId();
            ID id = new ID();
            id.setID(productRatePlanId);
            ratePlan.setProductRatePlanId(id);

            // If there is price per quantity defined, set up RatePlanCharge
            // data to override all quantities on this plan with the given
            // amount
            CatalogRatePlan crp = Catalog.getRatePlan(productRatePlanId);
            if (crp.getQuantifiable()) {
                if (cartItem.getQuantity() == null) {
                    throw new Exception("NULL_QTY");
                }
                BigDecimal bdQty = null;
                try {
                    double qty = Double.parseDouble(cartItem.getQuantity());
                    bdQty = new BigDecimal(qty);
                } catch (Exception e) {
                    throw new Exception("PARSE_QTY_ERROR");
                }

                ArrayList<RatePlanChargeData> rpcds = new ArrayList<RatePlanChargeData>();
                ArrayList<CatalogCharge> ccharges = crp.getCharges();
                for (CatalogCharge ccharge : ccharges) {
                    if ((ccharge.getChargeModel().equals("Per Unit Pricing")
                            || ccharge.getChargeModel()
                            .equals("Tiered Pricing") || ccharge
                            .getChargeModel().equals("Volume Pricing"))
                            && !ccharge.getChargeType().equals("Usage")) {
                        RatePlanChargeData rpcd = new RatePlanChargeData();
                        RatePlanCharge rpc = new RatePlanCharge();
                        ID chargeid = new ID();
                        chargeid.setID(ccharge.getId());
                        rpc.setProductRatePlanChargeId(chargeid);
                        rpc.setQuantity(bdQty);
                        rpcd.setRatePlanCharge(rpc);
                        rpcds.add(rpcd);
                    }
                }
                rpcds.trimToSize();
                if (rpcds.size() > 0) {
                    RatePlanChargeData[] rpcdsA = rpcds
                            .toArray(new RatePlanChargeData[rpcds.size()]);
                    ratePlanData.setRatePlanChargeData(rpcdsA);
                }
            }

            // Add this RatePlanData to the subscription data
            rpds.add(ratePlanData);
        }
        rpds.trimToSize();

        RatePlanData[] rpdsArray = new RatePlanData[rpds.size()];
        for (int i = 0; i < rpds.size(); i++) {
            rpdsArray[i] = rpds.get(i);
        }
        return rpdsArray;
    }

    /**
     * Retrieve all details of the current and removed rateplans on the logged
     * in user's subscription.
     * <p/>
     * CNET Custom work: retrieve all subscriptions.
     *
     * @param userEmail User's given Email address
     * @return Active Subscription details
     * @throws Exception
     */
    public List<AmenderSubscription> getAllSubscription(String accountName)
            throws Exception {

        List<AmenderSubscription> subscriptionList = new ArrayList<AmenderSubscription>();

        // Step #1: get the associated account Id
        Account account = zrepo.AccountR.GetByName(accountName);
        String accountId = account.getId().getID();

        // Step #2: query all subscriptions with this account ID
        Subscription[] subscriptions = zrepo.SubscriptionR
                .GetSubscriptions(accountId);

        if (subscriptions.length == 0) {
            AmenderSubscription activeSubscription = new AmenderSubscription();
            activeSubscription.setSuccess(false);
            activeSubscription.setError("SUBSCRIPTION_DOESNT_EXIST");
            subscriptionList.add(activeSubscription);
            return subscriptionList;
        }

        for (Subscription subscription : subscriptions) {
            AmenderSubscription activeSubscription = new AmenderSubscription();

            activeSubscription.setUserEmail(accountName);
            activeSubscription.setSubscriptionId(subscription.getId().getID());
            activeSubscription.setVersion(subscription.getVersion());

            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

            activeSubscription.setEndOfTermDate(Calendar.getInstance());

            if (subscription.getTermEndDate() == null) {
                activeSubscription.setEndDate("EVERGREEN");
            } else {
                activeSubscription.setEndDate(dateFormat.format(subscription
                        .getTermEndDate().getTime()));
            }

            activeSubscription.setStartDate(dateFormat.format(subscription
                    .getTermStartDate().getTime()));

            // Prepare list of existing rate plan
            List<AmenderPlan> activePlans = new ArrayList<AmenderPlan>();
            List<AmenderPlan> removedPlans = new ArrayList<AmenderPlan>();

            // Get active rate plan
            RatePlan[] ratePlans = zrepo.RatePlanR
                    .GetRatePlans(activeSubscription.getSubscriptionId());

            if (ratePlans.length > 0) {
                // Loop through all the rate plan
                for (RatePlan rp : ratePlans) {
                    AmenderPlan newPlan = new AmenderPlan();
                    newPlan.setId(rp.getId().getID());
                    newPlan.setName(rp.getName());

                    ProductRatePlan curPrp = zrepo.ProductRatePlanR.GetById(rp
                            .getProductRatePlanId().getID());
                    Product curProd = zrepo.ProductR.GetById(curPrp
                            .getProductId().getID());

                    newPlan.setDescription((curPrp.getDescription() != null) ? curPrp
                            .getDescription() : "");
                    newPlan.setProductName(curProd.getName());
                    newPlan.setProductId(curProd.getId().getID());

                    // Get all charges
                    List<AmenderCharge> charges = new ArrayList<AmenderCharge>();

                    RatePlanCharge[] ratePlanCharges = zrepo.RatePlanChargeR
                            .GetByRatePlan(rp.getId().getID());
                    for (RatePlanCharge rpc : ratePlanCharges) {
                        AmenderCharge newCharge = new AmenderCharge();

                        newCharge.setId(rpc.getId().getID());
                        newCharge.setName(rpc.getName());
                        newCharge.setChargeModel(rpc.getChargeModel());
                        newCharge.setProductRatePlanChargeId(rpc
                                .getProductRatePlanChargeId().getID());

                        if (!rpc.getChargeModel().equals("Flat Fee Pricing")
                                && !rpc.getChargeType().equals("Usage")) {
                            newPlan.setUom(rpc.getUOM());
                            newPlan.setQuantity(rpc.getQuantity()
                                    .toPlainString());
                            newCharge.setUom(rpc.getUOM());
                            newCharge.setQuantity(rpc.getQuantity()
                                    .toPlainString());
                        }

                        // For all charges, find maximum ChargedThroughDate
                        if (rpc.getChargedThroughDate() != null) {
                            if (rpc.getChargedThroughDate().compareTo(
                                    Calendar.getInstance()) > 0) {
                                activeSubscription.setEndOfTermDate(rpc
                                        .getChargedThroughDate());
                            }
                        }

                        // get the price
                        RatePlanChargeTier[] ratePlanChargeTier = zrepo.RatePlanChargeTierR
                                .GetByRatePlanChargeId(rpc.getId().getID());
                        RatePlanChargeTier prpct = ratePlanChargeTier[0];
                        BigDecimal price = prpct.getPrice();
                        if (price == null || price.intValue() == 0) {
                            price = BigDecimal.ZERO;
                        }
                        newCharge.setPrice(price);

                        charges.add(newCharge);
                    }

                    newPlan.setAmenderCharges(charges);
                    activePlans.add(newPlan);
                }
            }

            // Get removed rate plan
            // Get active rate plan
            RatePlan[] removedRatePlans = zrepo.RatePlanR
                    .GetRemovedRatePlans(activeSubscription.getSubscriptionId());
            if (removedRatePlans.length > 0) {
                for (RatePlan rp : removedRatePlans) {
                    AmenderPlan newPlan = new AmenderPlan();
                    newPlan.setId(rp.getId().getID());
                    newPlan.setName(rp.getName());

                    ProductRatePlan curPrp = zrepo.ProductRatePlanR.GetById(rp
                            .getProductRatePlanId().getID());
                    Product curProd = zrepo.ProductR.GetById(curPrp
                            .getProductId().getID());

                    newPlan.setDescription((curPrp.getDescription() != null) ? curPrp
                            .getDescription() : "");
                    newPlan.setProductName(curProd.getName());

                    newPlan.setAmendmentId(rp.getAmendmentId().getID());
                    newPlan.setAmendmentType(rp.getAmendmentType());
                    newPlan.setEffectiveDate("end of current billing period.");

                    // Query amendment for this rate plan to get Effective
                    // Removal Date
                    Amendment amd = zrepo.AmendmentR.GetById(newPlan
                            .getAmendmentId());
                    newPlan.setEffectiveDate(dateFormat.format(amd
                            .getContractEffectiveDate().getTime()));

                    // Get all charges
                    List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
                    RatePlanCharge[] ratePlanCharges = zrepo.RatePlanChargeR.GetByRatePlan(rp.getId().getID());
                    for (RatePlanCharge rpc : ratePlanCharges) {
                        AmenderCharge newCharge = new AmenderCharge();

                        newCharge.setId(rpc.getId().getID());
                        newCharge.setName(rpc.getName());
                        newCharge.setChargeModel(rpc.getChargeModel());
                        newCharge.setProductRatePlanChargeId(rpc
                                .getProductRatePlanChargeId().getID());

                        if (!rpc.getChargeModel().equals("Flat Fee Pricing")
                                && rpc.getChargeType() != "Usage") {
                            newPlan.setUom(rpc.getUOM());
                            newPlan.setQuantity(rpc.getQuantity()
                                    .toPlainString());
                            newCharge.setUom(rpc.getUOM());
                            newCharge.setQuantity(rpc.getQuantity()
                                    .toPlainString());
                        }

                        // For all charges, find maximum ChargedThroughDate
                        if (rpc.getChargedThroughDate() != null) {
                            if (rpc.getChargedThroughDate().compareTo(
                                    Calendar.getInstance()) > 0) {
                                activeSubscription.setEndOfTermDate(rpc
                                        .getChargedThroughDate());
                            }
                        }

                        charges.add(newCharge);
                    }
                    removedPlans.add(newPlan);
                }
            }

            activeSubscription.setActivePlans(activePlans);
            activeSubscription.setRemovedPlans(removedPlans);
            subscriptionList.add(activeSubscription);
        }

        for (AmenderSubscription amenderSubscription : subscriptionList) {
            amenderSubscription.setSuccess(true);
        }
        return subscriptionList;
    }
}
