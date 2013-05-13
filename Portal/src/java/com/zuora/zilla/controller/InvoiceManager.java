package com.zuora.zilla.controller;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.object.Invoice;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.model.SummaryInvoice;
import org.springframework.cache.Cache;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InvoiceManager {

    private ZuoraRepository zr;

    public InvoiceManager(ZuoraRepository zr) {
        this.zr = zr;
    }

    public InvoiceManager(Cache c) throws Exception {
        this(new ZuoraRepository(c));
    }

    /**
     * Retrieves the latest invoice on the given user's account as a PDF body to
     * be rendered by the user's browser.
     *
     * @param accountName Name of the target account
     * @return PDF Body of invoice
     */
    public String getLastInvoicePdf(String accountName) throws Exception {
        String accountId = zr.AccountR.GetIdByName(accountName);
        Invoice[] invoicesresult = zr.InvoiceR.GetByAccountId(accountId);
        List<Invoice> listInvoices = new ArrayList<Invoice>();

        for (ZObject z1 : invoicesresult) {
            Invoice invoice = (Invoice) z1;
            listInvoices.add(invoice);
        }

        if (listInvoices.size() > 0) {
            // Sort invoices by invoice date
            Collections.sort(listInvoices, new CmpInvoices());

            Invoice[] invoices = listInvoices.toArray(new Invoice[listInvoices
                    .size()]);

            Invoice i = zr.InvoiceR.GetInvoiceBody(invoices[0].getId().getID());
            return i.getBody();
        }
        return null;
    }

    /**
     * Return the Invoice PDF associated with this Invoice
     *
     * @param invoiceId ID to retrieve the invoice
     * @return PDF in a string (base64 encoding)
     */
    public String getInvoicePdf(String invoiceId) throws Exception {
        Invoice invoice = zr.InvoiceR.GetInvoiceBody(invoiceId);
        return invoice.getBody();
    }

    /**
     * Return the latest <max> invoices that has been posted to this account.
     *
     * @param accountName Indicate which account to look at
     * @param maxInvoices Define the maximum number of invoices to retrieve
     * @return list of SummaryInvoice objects
     */
    public List<SummaryInvoice> getLatestInvoices(String accountName,
                                                  Integer maxInvoices) throws Exception {
        // Step #1: get the associated account Id
        String accountId = zr.AccountR.GetIdByName(accountName);

        // Step #2: get all invoices associated with this account ID
        Invoice[] invoices = zr.InvoiceR.GetByAccountId(accountId);
        List<Invoice> listInvoices = new ArrayList<Invoice>();

        for (ZObject z1 : invoices) {
            Invoice invoice = (Invoice) z1;
            listInvoices.add(invoice);
        }

        if (listInvoices.size() > 0) {
            // Sort invoices by invoice date DESC
            Collections.sort(listInvoices, new CmpInvoices());
            Collections.reverse(listInvoices);
        }

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        // Step #3: Convert Invoice objects (from Zuora) to SummaryInvoices
        // object
        List<SummaryInvoice> summaryInvoices = new ArrayList<SummaryInvoice>();
        for (Invoice i : listInvoices) {
            SummaryInvoice summary = new SummaryInvoice();
            summary.setDueDate(df.format(i.getDueDate().getTime()));
            summary.setId(i.getId().getID());
            summary.setInvoiceDate(df.format(i.getCreatedDate().getTime()));
            summary.setTotalAmount(i.getAmount().toPlainString());
            summaryInvoices.add(summary);
        }

        // Step #4: Return either the whole list or just the sublist matching
        // the number of invoices required
        if (summaryInvoices.size() > maxInvoices)
            return summaryInvoices.subList(0, maxInvoices);
        else
            return summaryInvoices;
    }

    /**
     * Comparator to sort invoices by invoice date
     */
    private class CmpInvoices implements Comparator<Invoice> {

        public int compare(Invoice a, Invoice b) {
            return a.getCreatedDate().compareTo(b.getCreatedDate());
        }

    }
}
