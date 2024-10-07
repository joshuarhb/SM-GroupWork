package user;

public class User {
    private  int userID;
    private  String userFirstName;
    private  String userLastName;
    private String email;
    private int phoneNumber;
    private String address;
    private String createDate;


    public User(int userID, String userFirstName, String userLastName, String email, int phoneNumber, String address, String createDate) {
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createDate = createDate;
    }

    public User(int userID) {
    }


    public int getUserID() {
        return userID;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
