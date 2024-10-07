package services;

import user.User;

public class Issurance extends User {

    int issueTypeID;
    int carID;
    int providerName;
    int validFrom;
    int validTo;

    public Issurance(int userID) {
        super(userID);
    }

    public Issurance(int userID, int issueTypeID, int carID, int providerName, int validFrom, int validTo) {
        super(userID);
        this.issueTypeID = issueTypeID;
        this.carID = carID;
        this.providerName = providerName;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }


    public int getIssueTypeID() {
        return issueTypeID;
    }

    public void setIssueTypeID(int issueTypeID) {
        this.issueTypeID = issueTypeID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getProviderName() {
        return providerName;
    }

    public void setProviderName(int providerName) {
        this.providerName = providerName;
    }

    public int getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(int validFrom) {
        this.validFrom = validFrom;
    }

    public int getValidTo() {
        return validTo;
    }

    public void setValidTo(int validTo) {
        this.validTo = validTo;
    }
}
