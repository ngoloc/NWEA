package com.nwea.portal.repository;

import com.zuora.api.object.Invoice;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.util.ZApi;
import org.springframework.cache.Cache;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Dana
 * Date: 4/28/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceRepository extends RepositoryBase {
    public InvoiceRepository(Cache c, ZApi api) throws Exception {
        super(c, api);
    }

    public Invoice[] GetByAccountId(String accountId) throws Exception {
        ZObject[] results = Query("SELECT Id,Amount,DueDate,CreatedDate FROM Invoice WHERE AccountId='"
                + accountId + "'");
        Invoice[] invoices = Arrays.copyOf(results, results.length, Invoice[].class);
        return invoices;
    }

    public Invoice GetInvoiceBody(String invoiceId) throws Exception {
        ZObject[] results = Query("SELECT Body FROM Invoice WHERE Id='"
                + invoiceId + "'", true);
        return (Invoice) results[0];
    }
}
