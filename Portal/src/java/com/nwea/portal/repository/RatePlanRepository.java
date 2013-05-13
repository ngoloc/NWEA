package com.nwea.portal.repository;

import com.zuora.api.object.RatePlan;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class RatePlanRepository extends RepositoryBase {

    private static final String columns = "Id,Name,ProductRatePlanId,AmendmentType,AmendmentId";

    private static final String query = "SELECT %s FROM RatePlan WHERE %s = '%s'";

    public RatePlanRepository(Cache c, ZApi api) throws Exception {
        super(c, api);

    }

    public RatePlan[] GetRatePlans(String subscriptionId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "SubscriptionId", subscriptionId), true);
        RatePlan[] ratePlans = Arrays.copyOf(results, results.length, RatePlan[].class);
        return (RatePlan[]) ratePlans;

    }

    public RatePlan[] GetRemovedRatePlans(String subscriptionId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "SubscriptionId", subscriptionId) + " AND AmendmentType = 'RemoveProduct'", true);
        RatePlan[] ratePlans = Arrays.copyOf(results, results.length, RatePlan[].class);
        return (RatePlan[]) ratePlans;
    }
}
