package Services;


public class Customize {

    private int customizeID;
    private int carID;
    private int userID;
    private int serviceID;
    private String startTime;
    private String endTime;

    public int getCustomizeID() {
        return customizeID;
    }


    public void setCustomizeID(int customizeID) {
        this.customizeID = customizeID;
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

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
