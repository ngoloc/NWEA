package com.nwea.portal.repository;

import com.zuora.api.object.PaymentMethod;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class PaymentMethodRepository extends RepositoryBase {

    private static final String columns =
            "Id," +
            "Type," +
            "Active," +
            "CreditCardAddress1," +
            "CreditCardAddress2," +
            "CreditCardCity," +
            "CreditCardCountry," +
            "CreditCardHolderName," +
            "CreditCardPostalCode," +
            "CreditCardState," +
            "CreditCardType," +
            "CreditCardMaskNumber," +
            "CreditCardExpirationYear," +
            "CreditCardExpirationMonth, " +
            "Phone," +
            "AccountId";

    private static final String query = "SELECT %s FROM PaymentMethod WHERE %s = '%s'";

    public PaymentMethodRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public PaymentMethod GetById(String paymentMethodId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "Id", paymentMethodId));
        return (PaymentMethod) results[0];
    }

    public PaymentMethod[] GetByAccountId(String accountId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "AccountId", accountId));
        PaymentMethod[] paymentMethods = Arrays.copyOf(results, results.length, PaymentMethod[].class);
        return (PaymentMethod[]) paymentMethods;
    }

    public PaymentMethod GetCashPaymentMethod() throws Exception {
        ZObject[] results = Query("SELECT " + columns + " FROM PaymentMethod WHERE Type = 'Cash'", true);
        return (PaymentMethod) results[0];
    }
}
