package com.nwea.portal.repository;

import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class ProductRatePlanChargeTierRepository extends RepositoryBase {

    public ProductRatePlanChargeTierRepository(Cache cache, ZApi api) throws Exception {
        super(cache, api);
    }

    public ProductRatePlanChargeTier[] GetByRatePlanChargeId(String ratePlanChargeId) throws Exception {
        ZObject[] results = Query("SELECT Id, Price FROM ProductRatePlanChargeTier WHERE ProductRatePlanChargeId = '" + ratePlanChargeId + "'", true);
        ProductRatePlanChargeTier[] prpct = Arrays.copyOf(results, results.length, ProductRatePlanChargeTier[].class);
        return prpct;
    }
}
