package com.nwea.portal.repository;

import com.zuora.api.object.Product;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import com.zuora.zilla.util.ZuoraUtility;
import org.springframework.cache.Cache;

import java.util.Arrays;
import java.util.HashSet;

public class ProductRepository extends RepositoryBase {

    private static final String columns = "Id, Name, Description, Component1__c";

    private static final String query = "SELECT " + columns + " FROM Product WHERE %s = '%s'";

    public ProductRepository(Cache cache, ZApi zapi) throws Exception {
        super(cache, zapi);
        // TODO Auto-generated constructor stub
    }

    public Product GetById(String id) throws Exception {

        ZObject[] results = Query(String.format(query, "Id", id), true);
        return (Product) results[0];
    }

    public Product[] GetProducts() throws Exception {
        String querybase = "" +
                "SELECT %s " +
                "FROM Product " +
                "WHERE EffectiveStartDate < '%s' and EffectiveEndDate > '%s' "
                + "and DisplayinWebsite__c = 'Yes' ";
        ZObject[] results = Query(String.format(querybase, columns, ZuoraUtility.getCurrentDate(), ZuoraUtility.getCurrentDate()), true);
        Product[] products = Arrays.copyOf(results, results.length, Product[].class);
        return products;
    }

    public Product[] GetByComponent(String component) throws Exception {
        String query = String.format(ProductRepository.query, "Component1__c", component);
        ZObject[] results = Query(query, true);
        Product[] products = Arrays.copyOf(results, results.length, Product[].class);
        return products;
    }

    public Product[] GetRelatedProducts(String[] productIds) throws Exception {
        HashSet<Product> relatedProducts = new HashSet<Product>();
        HashSet<String> components = new HashSet<String>();
        for (String productId : productIds) {
            Product p = GetById(productId);
            components.add(p.getComponent1());
        }

        for (String component1 : components) {
            Product[] rps = GetByComponent(component1);
            for (Product rp : rps) {
                relatedProducts.add(rp);
            }
        }

        return relatedProducts.toArray(new Product[relatedProducts.size()]);
    }
}
