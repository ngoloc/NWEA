package com.nwea.portal.repository;

import com.zuora.api.object.Account;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

public class AccountRepository extends RepositoryBase {

    private static final String columns = "" +
            "Id, " +
            "Name, " +
            "AccountNumber, " +
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

    public String GetIdByAgencyCode(String agencyCode) throws Exception {
        ZObject[] results = Query("SELECT Id FROM Account WHERE AccountNumber = '" + agencyCode + "' OR AgencyCode__c = '" + agencyCode + "'", true);
        if (results.length == 0) {
            return null;
        }
        return results[0].getId().getID();
    }

    public String GetIdByNumber(String accountNumber) throws Exception {
        ZObject[] results = Query("SELECT Id FROM Account WHERE AccountNumber = '" + accountNumber + "'", true);
        if (results.length == 0) {
            return null;
        }
        return results[0].getId().getID();
    }

    public Account GetByName(String accountName) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "Name", accountName));
        if(results.length == 0){
            return null;
        }
        return (Account) results[0];
    }

    public Account GetByNumber(String accountNumber) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "AccountNumber", accountNumber));
        if(results.length == 0){
            return null;
        }
        return (Account) results[0];
    }

    public Account GetByAgencyCode(String agencyCode) throws Exception {
        String q = String.format(query, columns, "AccountNumber", agencyCode);
        q += " OR AgencyCode__c = '" + agencyCode + "'";
        ZObject[] results = Query(q);
        if(results.length == 0){
            return null;
        }
        return (Account) results[0];
    }

    public Account GetById(String accountId) throws Exception {
        ZObject[] results = Query(String.format(query, columns, "Id", accountId));
        if(results.length == 0){
            return null;
        }
        return (Account) results[0];
    }

    public void Update(Account account) throws Exception {
        super.Update(account);
    }

    public String Create(Account account) throws Exception {
        return super.Create(account);
    }

}
