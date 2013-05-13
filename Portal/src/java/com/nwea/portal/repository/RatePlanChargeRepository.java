package com.nwea.portal.repository;

import com.zuora.api.object.RatePlanCharge;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class RatePlanChargeRepository extends RepositoryBase {

    public RatePlanChargeRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public RatePlanCharge[] GetByRatePlan(String ratePlanId) throws Exception {
        ZObject[] results = Query("SELECT Id,Name,ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,Quantity,ChargedThroughDate "
                + "FROM RatePlanCharge WHERE RatePlanId='"
                + ratePlanId + "'", true);
        RatePlanCharge[] ratePlanCharges = Arrays.copyOf(results, results.length, RatePlanCharge[].class);
        return ratePlanCharges;
    }
}
