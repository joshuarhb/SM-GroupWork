package com.RentFast.App.Entities;

public class User {
    private final int userID;
    private final String userFirstName;
    private final String userLastName;
    private final int phoneNumber; //
    private final String licenseId;
    private final long signUpDate;


    public User(int userID, String userFirstName, String userLastName, int phoneNumber, String licenseId, long signUpDate) {
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.phoneNumber = phoneNumber;
        this.licenseId = licenseId;
        this.signUpDate = signUpDate;
    }
}
