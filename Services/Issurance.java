package Services;

public class Issurance {

    int issueTypeID;
    int userID;
    int carID;
    int providerName;
    int validFrom;
    int validTo;

    public Issurance(int issueTypeID, int userID, int carID, int providerName, int validFrom, int validTo) {
        this.issueTypeID = issueTypeID;
        this.userID = userID;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
