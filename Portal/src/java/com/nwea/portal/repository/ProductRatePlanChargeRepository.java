package com.nwea.portal.repository;

import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class ProductRatePlanChargeRepository extends RepositoryBase {

    public ProductRatePlanChargeRepository(Cache cache, ZApi api) throws Exception {
        super(cache, api);
    }

    public ProductRatePlanCharge[] GetByRatePlanId(String ratePlanId) throws Exception {
        ZObject[] results = Query("SELECT Id, ChargeModel FROM ProductRatePlanCharge WHERE ProductRatePlanId = '" + ratePlanId + "'", true);
        ProductRatePlanCharge[] prpc = Arrays.copyOf(results, results.length, ProductRatePlanCharge[].class);
        return (ProductRatePlanCharge[]) prpc;
    }

}
