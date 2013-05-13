package com.zuora.zilla.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;
import java.util.List;

public class AmenderSubscription {

    private boolean success;
    private String error;

    private String userEmail;
    private String subscriptionId;
    private Integer version;
    private List<AmenderPlan> activePlans;
    private List<AmenderPlan> removedPlans;
    private Calendar endOfTermDate;
    private String endDate;
    private String startDate;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @JsonProperty("subId")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @JsonProperty("Version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("active_plans")
    public List<AmenderPlan> getActivePlans() {
        return activePlans;
    }

    public void setActivePlans(List<AmenderPlan> activePlans) {
        this.activePlans = activePlans;
    }

    public List<AmenderPlan> getRemovedPlans() {
        return removedPlans;
    }

    @JsonProperty("removed_plans")
    public void setRemovedPlans(List<AmenderPlan> removedPlans) {
        this.removedPlans = removedPlans;
    }

    public Calendar getEndOfTermDate() {
        return endOfTermDate;
    }

    public void setEndOfTermDate(Calendar endOfTermDate) {
        this.endOfTermDate = endOfTermDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
