package com.RentFast.App.Billing;

import java.time.LocalDate;
import java.util.UUID;

public class Insurance {
    private final String insuranceId = UUID.randomUUID().toString();
    private String userId;
    private String insuranceProvider;
    private String policyNumber;
    private LocalDate validFrom;
    private LocalDate validTo;

    public Insurance(String userId, String insuranceProvider, String policyNumber, LocalDate validFrom, LocalDate validTo) {
        this.userId = userId;
        this.insuranceProvider = insuranceProvider;
        this.policyNumber = policyNumber;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getinsuranceId() {
        return insuranceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }
}
