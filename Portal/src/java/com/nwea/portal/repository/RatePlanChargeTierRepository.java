package com.nwea.portal.repository;

import com.zuora.api.object.RatePlanChargeTier;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class RatePlanChargeTierRepository extends RepositoryBase {

    public RatePlanChargeTierRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public RatePlanChargeTier[] GetByRatePlanChargeId(String ratePlanChargeTierId) throws Exception {
        ZObject[] results = Query("SELECT Id,Price "
                + "FROM RatePlanChargeTier WHERE RatePlanChargeId=='"
                + ratePlanChargeTierId + "'", true);
        RatePlanChargeTier[] ratePlanChargeTiers = Arrays.copyOf(results, results.length, RatePlanChargeTier[].class);
        return ratePlanChargeTiers;

    }

}
