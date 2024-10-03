package com.RentFast.App.Entities;

public class Car extends Vehicle{
    private final CarDriver currentDriver;

    public Car(String licensePlate, String make, String model, boolean isAvailable, boolean isRented, CarDriver currentDriver) {
        super(licensePlate, make, model, isAvailable, isRented);
        this.currentDriver = currentDriver;
    }
}
