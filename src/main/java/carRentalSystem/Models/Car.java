package carRentalSystem.Models;

import carRentalSystem.Models.enums.VehicleType;

public class Car extends Vehicle{

    public Car(String id, String vehicleName, String vehicleNumber, int price) {
        super( id, vehicleName, vehicleNumber, price, VehicleType.CAR);
    }
}
