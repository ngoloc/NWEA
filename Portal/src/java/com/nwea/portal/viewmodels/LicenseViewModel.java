package com.nwea.portal.viewmodels;

import java.math.BigDecimal;

public class LicenseViewModel {

    private String name;

    private int quantity;

    private int suggestedQuantity;

    private BigDecimal pricePerUnit;

    private String productId;

    private BigDecimal charge;

    private String renewalEndDate;

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getRenewalEndDate() {
        return renewalEndDate;
    }

    public void setRenewalEndDate(String renewalEndDate) {
        this.renewalEndDate = renewalEndDate;
    }

    public BigDecimal getCharge() {
        return this.charge;
    }

    public void setCharge(BigDecimal c) {
        this.charge = c;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getSuggestedQuantity() {
        return this.suggestedQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSuggestedQuantity(int suggestedQuantity) {
        this.suggestedQuantity = suggestedQuantity;
    }

}
