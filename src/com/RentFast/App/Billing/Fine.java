package com.RentFast.App.Billing;

import java.time.LocalDate;
import java.util.UUID;

public class Fine {

    private final String fineId = UUID.randomUUID().toString();
    private String userId;
    private double fineAmount;
    private String fineReason;
    private LocalDate incidentDate;
    private LocalDate fineIssuedDate;
    private LocalDate fineDueDate;
    private LocalDate finePaidDate;
    private boolean isPaid;

    public Fine(String userId, double fineAmount, String fineReason, LocalDate incidentDate, LocalDate fineIssuedDate, LocalDate fineDueDate, LocalDate finePaidDate, boolean isPaid) {
        this.userId = userId;
        this.fineAmount = fineAmount;
        this.fineReason = fineReason;
        this.incidentDate = incidentDate;
        this.fineIssuedDate = fineIssuedDate;
        this.fineDueDate = fineDueDate;
        this.finePaidDate = finePaidDate;
        this.isPaid = isPaid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getFinePaidDate() {
        return finePaidDate;
    }

    public void setFinePaidDate(LocalDate finePaidDate) {
        this.finePaidDate = finePaidDate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getFineReason() {
        return fineReason;
    }

    public void setFineReason(String fineReason) {
        this.fineReason = fineReason;
    }

    public LocalDate getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDate incidentDate) {
        this.incidentDate = incidentDate;
    }

    public LocalDate getFineIssuedDate() {
        return fineIssuedDate;
    }

    public void setFineIssuedDate(LocalDate fineIssuedDate) {
        this.fineIssuedDate = fineIssuedDate;
    }

    public LocalDate getFineDueDate() {
        return fineDueDate;
    }

    public void setFineDueDate(LocalDate fineDueDate) {
        this.fineDueDate = fineDueDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getFineId() {
        return fineId;
    }
}
