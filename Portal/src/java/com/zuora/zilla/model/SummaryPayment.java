package com.zuora.zilla.model;

public class SummaryPayment {

    private String id;
    private String date;
    private String paymentApplied;
    private String type;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentApplied() {
        return paymentApplied;
    }

    public void setPaymentApplied(String paymentApplied) {
        this.paymentApplied = paymentApplied;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
