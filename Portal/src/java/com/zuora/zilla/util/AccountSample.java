package com.zuora.zilla.util;

import com.zuora.api.PreviewOptions;
import com.zuora.api.SubscribeOptions;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;

public class AccountSample {

    /**
     * Set up account to preview current subscription.
     *
     * @return the account
     */
    public static Account makeAccount() {
        Account acc = new Account();
        acc.setAutoPay(false);
        acc.setCurrency("USD");
        acc.setName("TestName");
        acc.setPaymentTerm("Net 30");
        acc.setBatch("Batch1");
        acc.setBillCycleDay(ZuoraUtility.getCurrentDayNumber());
        acc.setStatus("Active");
        return acc;
    }

    /**
     * Make contact.
     *
     * @return the contact
     */
    public static Contact makeContact() {
        Contact contact = new Contact();
        contact.setCountry("United States");
        contact.setFirstName("TestFirst");
        contact.setLastName("TestLast");
        contact.setState("California");
        return contact;
    }

    /**
     * Make subscription options
     *
     * @return the options
     */
    public static SubscribeOptions makeSubscriptionOptions() {
        SubscribeOptions options = new SubscribeOptions();
        options.setGenerateInvoice(true);
        options.setProcessPayments(false);
        return options;
    }

    /**
     * Make preview options.
     *
     * @return the options
     */
    public static PreviewOptions makePreviewOptions() {
        PreviewOptions options = new PreviewOptions();
        options.setEnablePreviewMode(true);
        options.setNumberOfPeriods(1);
        return options;
    }
}
