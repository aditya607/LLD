package carRentalSystem.Models;

import carRentalSystem.Models.enums.VehicleType;

public class Bike extends Vehicle{

    public Bike(String id, String vehicleName, String vehicleNumber, int price) {
        super(id, vehicleName, vehicleNumber, price, VehicleType.BIKE);
    }
}
