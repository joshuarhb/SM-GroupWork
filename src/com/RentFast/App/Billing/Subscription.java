package com.RentFast.App.Billing;

import java.time.LocalDate;
import java.util.UUID;

public class Subscription {
    private final String subscriptionId = UUID.randomUUID().toString();
    private String customerId;
    private String subscriptionType;
    private LocalDate subStartDate;
    private LocalDate subEndDate;
    private int renewalRate; //1 = monthly, 2 = yearly, other rates could be good

    public Subscription(String customerId, String subscriptionType, LocalDate subStartDate, LocalDate subEndDate, int renewalRate) {
        this.customerId = customerId;
        this.subscriptionType = subscriptionType;
        this.subStartDate = subStartDate;
        this.subEndDate = subEndDate;
        this.renewalRate = renewalRate;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public LocalDate getSubStartDate() {
        return subStartDate;
    }

    public void setSubStartDate(LocalDate subStartDate) {
        this.subStartDate = subStartDate;
    }

    public LocalDate getSubEndDate() {
        return subEndDate;
    }

    public void setSubEndDate(LocalDate subEndDate) {
        this.subEndDate = subEndDate;
    }

    public int getRenewalRate() {
        return renewalRate;
    }

    public void setRenewalRate(int renewalRate) {
        this.renewalRate = renewalRate;
    }
}
