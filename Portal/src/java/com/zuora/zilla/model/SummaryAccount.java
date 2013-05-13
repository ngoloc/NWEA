package com.zuora.zilla.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class SummaryAccount {

    private Boolean success;
    private String error;

    private String name;
    private BigDecimal balance;
    private BigDecimal lastPaymentAmount;
    private Calendar lastPaymentDate;
    private Calendar lastInvoiceDate;

    private SummaryContact contactSummary;
    private SummaryContact soldToContactSummary;
    private List<PaymentDetail> paymentMethodSummaries;
    private List<SummaryInvoice> invoiceSummaries;
    private List<SummaryPayment> paymentSummaries;

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contactSummary")
    public SummaryContact getContactSummary() {
        return contactSummary;
    }

    @JsonProperty("soldToContactSummary")
    public SummaryContact getSoldToContactSummary() {
        return soldToContactSummary;
    }

    @JsonProperty("Balance")
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @JsonProperty("LastPaymentAmount")
    public BigDecimal getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    @JsonProperty("LastPaymentDate")
    public Calendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Calendar lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    @JsonProperty("LastInvoiceDate")
    public Calendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }

    public void setLastInvoiceDate(Calendar lastInvoiceDate) {
        this.lastInvoiceDate = lastInvoiceDate;
    }

    public void setContactSummary(SummaryContact contactSummary) {
        this.contactSummary = contactSummary;
    }

    public void setSoldToContactSummary(SummaryContact soldToContactSummary) {
        this.soldToContactSummary = soldToContactSummary;
    }

    @JsonProperty("paymentMethodSummaries")
    public List<PaymentDetail> getPaymentMethodSummaries() {
        return paymentMethodSummaries;
    }

    public void setPaymentMethodSummaries(
            List<PaymentDetail> paymentMethodSummaries) {
        this.paymentMethodSummaries = paymentMethodSummaries;
    }

    @JsonProperty("invoiceSummaries")
    public List<SummaryInvoice> getInvoiceSummaries() {
        return invoiceSummaries;
    }

    public void setInvoiceSummaries(List<SummaryInvoice> invoiceSummaries) {
        this.invoiceSummaries = invoiceSummaries;
    }

    @JsonProperty("paymentSummaries")
    public List<SummaryPayment> getPaymentSummaries() {
        return paymentSummaries;
    }

    public void setPaymentSummaries(List<SummaryPayment> paymentSummaries) {
        this.paymentSummaries = paymentSummaries;
    }

}
