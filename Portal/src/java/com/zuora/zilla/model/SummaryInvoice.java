package com.zuora.zilla.model;

/**
 * This class summarizes an invoice, so it can be displayed in the account view
 * from the User Interface (UI)
 *
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class SummaryInvoice {

    private String id;
    private String InvoiceDate;
    private String dueDate;
    private String totalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
