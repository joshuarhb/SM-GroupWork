package services;

import user.User;

public class HireDriver extends User {
    private int driverID;
    private float ratePerHours;
    private int serviceTotalHours;

    public HireDriver(int userID) {
        super(userID);
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }



    public void setRatePerHours(float ratePerHours) {
        this.ratePerHours = ratePerHours;
    }

    public int getServiceTotalHours() {
        return serviceTotalHours;
    }

    public void setServiceTotalHours(int serviceTotalHours) {
        this.serviceTotalHours = serviceTotalHours;
    }

    public float getRatePerHours() {
        return ratePerHours;
    }
}
