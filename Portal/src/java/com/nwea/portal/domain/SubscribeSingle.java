package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.util.ZuoraUtility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

public class SubscribeSingle {

    String accountName;

    String accountId;

    String paymentMethodId;

    String productId;

    BigDecimal quantity;

    Account account;

    boolean isCash;

    private ZuoraRepository zr;

    public SubscribeSingle(ZuoraRepository zr) throws Exception {
        this.zr = zr;
    }

    public void Subscribe(
            String accountName,
            String productId,
            String quantity,
            String type,
            String ponum) throws Exception {
        this.accountName = accountName;
        this.productId = productId;
        this.quantity = new BigDecimal(quantity);

        getAccountId();

        this.account = zr.AccountR.GetById(this.accountId);

        if (type.equals("cc")) {
            this.isCash = false;
            subscribeCC(productId);
        } else {
            subscribePO(productId, ponum);
        }
    }

    private void getAccountId() throws Exception {
        QueryResult qr1;
        this.accountId = zr.AccountR.GetIdByName(this.accountName);
    }

    private void getCashPaymentMethod() throws Exception {
        PaymentMethod cashPM = zr.PaymentMethodR.GetCachePaymentMethod();
        this.paymentMethodId = cashPM.getId().getID();
        this.isCash = true;
    }

    private void subscribePO(String productId, String ponum) throws Exception {
        updatePONum(ponum);
        getCashPaymentMethod();
        subscribe();
    }

    private void updatePONum(String ponum) throws Exception {
        String currentPONum = this.account.getPurchaseOrderNumber();
        if (currentPONum == null || !currentPONum.equals(ponum)) {
            Account uacc = new Account();
            uacc.setId(this.account.getId());
            uacc.setPurchaseOrderNumber(ponum);
            this.account.setPurchaseOrderNumber(ponum);
            zr.AccountR.Update(uacc);
        }
    }

    private void subscribeCC(String productId) throws Exception {
        getDefaultPM();
        subscribe();
    }

    private void getDefaultPM() throws Exception {
        if (this.account.getDefaultPaymentMethodId() != null) {
            this.paymentMethodId = this.account.getDefaultPaymentMethodId().getID();
        }

        if (this.paymentMethodId == null) {
            PaymentMethod[] pms = zr.PaymentMethodR.GetByAccountId(this.accountId);
            if (pms.length > 0) {
                this.paymentMethodId = pms[0].getId().getID();
            }
        }

        if (this.paymentMethodId == null) {
            throw new Exception("Couldn't find any payment methods for subscription.s");
        }
    }

    private RatePlanData[] getRatePlanData() throws Exception {
        ArrayList<RatePlanData> rpds = new ArrayList<RatePlanData>();

        RatePlanData ratePlanData = new RatePlanData();

        // Parameters for the current Rate Plan
        RatePlan ratePlan = new RatePlan();
        ratePlanData.setRatePlan(ratePlan);

        ProductRatePlan[] prps = zr.ProductRatePlanR.GetByProductId(this.productId);
        ProductRatePlan prp = prps[0];

        ratePlan.setProductRatePlanId(prp.getId());

        ArrayList<RatePlanChargeData> rpcds = new ArrayList<RatePlanChargeData>();

        QueryResult qr2;

        ProductRatePlanCharge[] prpcs = zr.ProductRatePlanChargeR.GetByRatePlanId(prp.getId().getID());
        ProductRatePlanCharge prpc = prpcs[0];

        RatePlanChargeData rpcd = new RatePlanChargeData();
        RatePlanCharge rpc = new RatePlanCharge();
        rpc.setProductRatePlanChargeId(prpc.getId());
        rpc.setQuantity(this.quantity);
        rpcd.setRatePlanCharge(rpc);
        rpcds.add(rpcd);

        if (rpcds.size() > 0) {
            RatePlanChargeData[] rpcdsA = rpcds
                    .toArray(new RatePlanChargeData[rpcds.size()]);
            ratePlanData.setRatePlanChargeData(rpcdsA);
        }

        rpds.add(ratePlanData);

        RatePlanData[] rpdsArray = new RatePlanData[rpds.size()];
        for (int i = 0; i < rpds.size(); i++) {
            rpdsArray[i] = rpds.get(i);
        }
        return rpdsArray;
    }

    private void subscribe() throws Exception {
        ZuoraUtility zu = new ZuoraUtility();
        Calendar today = Calendar.getInstance();

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

        SubscriptionData subscriptionData = new SubscriptionData();
        RatePlanData[] rpd = getRatePlanData();
        subscriptionData.setRatePlanData(rpd);
        subscriptionData.setSubscription(subscription);

        // Create the subscription request
        SubscribeRequest subReq = new SubscribeRequest();
        Account acc = this.account;
        ID defpmid = new ID();
        defpmid.setID(this.paymentMethodId);
        acc.setDefaultPaymentMethodId(defpmid);
        if (this.isCash) {
            acc.setAutoPay(false);
        }
        PaymentMethod pm = zr.PaymentMethodR.GetById(this.paymentMethodId);

        subReq.setAccount(acc);
        subReq.setBillToContact(zr.ContactR.GetById(acc.getBillToId().getID()));
        subReq.setSubscribeOptions(subscribeOptions);
        subReq.setPreviewOptions(previewOptions);
        subReq.setSubscriptionData(subscriptionData);
        subReq.setPaymentMethod(pm);

        SubscribeRequest[] subscribes = new SubscribeRequest[]{subReq};
        Subscribe subc = new Subscribe();
        subc.setSubscribes(subscribes);
        SubscribeResult[] resp = zr.SubscriptionR.DoSubscribe(subc);
        if (!resp[0].getSuccess()) {
            String error = resp[0].getErrors()[0].getMessage();
            throw new Exception(error);
        }
    }
}
