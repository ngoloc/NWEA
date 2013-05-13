package com.nwea.portal.repository;

import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

public class ProductRatePlanRepository extends RepositoryBase {

    private static final String columns = "Id, Name,Description,ProductId";

    private static final String query = "SELECT %s FROM ProductRatePlan WHERE %s = '%s'";

    public ProductRatePlanRepository(Cache cache, ZApi api) throws Exception {
        super(cache, api);
    }

    public ProductRatePlan[] GetByProductId(String productId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "ProductId", productId, true));
        ProductRatePlan[] productRatePlans = Arrays.copyOf(results, results.length, ProductRatePlan[].class);
        return productRatePlans;
    }

    public ProductRatePlan GetById(String productRatePlanId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "Id", productRatePlanId, true));
        return (ProductRatePlan) results[0];
    }

    public ProductRatePlan[] GetDisplayed(String productId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "ProductId", productId, true) + " AND DisplayinWebsite__c = 'Yes'", true);
        ProductRatePlan[] productRatePlans = Arrays.copyOf(results, results.length, ProductRatePlan[].class);
        return productRatePlans;
    }
}
