package vehicle;

public class Vehicle {

    private final String licensePlate;
    private final String make;
    private final String model;
    private boolean isAvailable; //different to rented, unavailable car could be getting repaired
    private boolean isRented;

    public Vehicle (String licensePlate, String make, String model, boolean isAvailable, boolean isRented) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.isAvailable = isAvailable;
        this.isRented = isRented;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
