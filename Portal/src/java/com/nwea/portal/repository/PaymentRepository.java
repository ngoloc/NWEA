package com.nwea.portal.repository;

import com.zuora.api.object.Payment;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class PaymentRepository extends RepositoryBase {

    public PaymentRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public Payment[] GetByAccountId(String accountId) throws Exception {
        ZObject[] results = Query("SELECT Amount,EffectiveDate,CreatedDate FROM Payment WHERE AccountId='"
                + accountId + "'");
        Payment[] payments = Arrays.copyOf(results, results.length, Payment[].class);
        return (Payment[]) payments;

    }
}
