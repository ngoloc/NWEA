package com.nwea.portal.repository;

import com.zuora.api.object.Account;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

public class AccountRepository extends RepositoryBase {

    private static final String columns = "" +
            "Id, " +
            "Name, " +
            "AgencyCode__c, " +
            "DisableWebManagement__c, " +
            "Status, " +
            "BillToId," +
            "SoldToId," +
            "Balance," +
            "LastInvoiceDate," +
            "PurchaseOrderNumber," +
            "DefaultPaymentMethodId";

    private static final String query = "SELECT %s FROM Account WHERE %s = '%s'";

    public AccountRepository(Cache cache, ZApi api) throws Exception {
        super(cache, api);
    }

    public String GetIdByName(String accountName) throws Exception {
        ZObject[] results = Query("SELECT Id FROM Account WHERE Name = '" + accountName + "'", true);
        if (results.length == 0) {
            return null;
        }
        return results[0].getId().getID();
    }

    public Account GetByName(String accountName) throws Exception {
        Account acc = null;
        ZObject[] results = Query(String.format(query, columns, "Name", accountName));
        acc = (Account) results[0];
        return acc;
    }

    public Account GetById(String accountId) throws Exception {
        Account acc = null;
        ZObject[] results = Query(String.format(query, columns, "Id", accountId));
        acc = (Account) results[0];
        return acc;
    }

    public void Update(Account account) throws Exception {
        super.Update(account);
    }

    public String Create(Account account) throws Exception {
        return super.Create(account);
    }

}
