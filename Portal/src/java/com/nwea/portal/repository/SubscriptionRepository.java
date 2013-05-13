package com.nwea.portal.repository;

import com.zuora.api.Subscribe;
import com.zuora.api.SubscribeResult;
import com.zuora.api.object.Subscription;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class SubscriptionRepository extends RepositoryBase {

    public SubscriptionRepository(Cache cache, ZApi api) throws Exception {
        super(cache, api);
    }

    public Subscription[] GetSubscriptions(String accountId) throws Exception {
        ZObject[] results = Query("SELECT Id,Name,Status,Version,PreviousSubscriptionId,"
                + "ContractEffectiveDate,TermEndDate,TermStartDate FROM Subscription WHERE AccountId='"
                + accountId + "' AND Status='Active'");
        Subscription[] subscriptions = Arrays.copyOf(results, results.length, Subscription[].class);
        return (Subscription[]) subscriptions;
    }

    public SubscribeResult[] DoSubscribe(Subscribe subscribe) throws Exception {
        return super.DoSubscribe(subscribe);
    }
}
