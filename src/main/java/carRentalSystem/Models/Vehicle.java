package carRentalSystem.Models;

import carRentalSystem.Models.enums.VehicleStatus;
import carRentalSystem.Models.enums.VehicleType;

public abstract class Vehicle {
    private String id;
    private String vehicleName;
    private String vehicleNumber;
    private VehicleType type;
    private int price;
    private VehicleStatus status;

    public Vehicle(String id, String vehicleName, String vehicleNumber, int price, VehicleType type) {
        this.id = id;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.price = price;
        this.type  = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
