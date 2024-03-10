package carRentalSystem.Models;

public class User {
    String name;
    String drivingLicense;

    public User(String name, String drivingLicense) {
        this.name = name;
        this.drivingLicense = drivingLicense;
    }
    public String getName() {
        return this.name;
    }

    public String getDrivingLicense() {
        return this.drivingLicense;
    }
}
