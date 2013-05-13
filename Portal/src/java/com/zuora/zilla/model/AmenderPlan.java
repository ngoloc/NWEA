package com.zuora.zilla.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;
import java.util.List;

public class AmenderPlan {

    private String id;
    private String name;
    private String description;
    private String productName;
    private String amendmentType;
    private String amendmentId;
    private String uom;
    private String quantity;
    private List<AmenderCharge> amenderCharges;
    private String effectiveDate;
    private String productId;
    private int suggestedQuantity;
    private Calendar enddate;
    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    public Calendar getEnddate() {
        return enddate;
    }

    public void setEnddate(Calendar enddate) {
        this.enddate = enddate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getSuggestedQuantity() {
        return this.suggestedQuantity;
    }

    public void setSuggestedQuantity(int sq) {
        this.suggestedQuantity = sq;
    }

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("AmendmentType")
    public String getAmendmentType() {
        return amendmentType;
    }

    public void setAmendmentType(String amendmentType) {
        this.amendmentType = amendmentType;
    }

    @JsonProperty("AmendmentId")
    public String getAmendmentId() {
        return amendmentId;
    }

    public void setAmendmentId(String amendmentId) {
        this.amendmentId = amendmentId;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("amender_charges")
    public List<AmenderCharge> getAmenderCharges() {
        return amenderCharges;
    }

    public void setAmenderCharges(List<AmenderCharge> amenderCharges) {
        this.amenderCharges = amenderCharges;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

}
