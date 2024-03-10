package carRentalSystem.inventory;

import carRentalSystem.Models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    private List<Vehicle> vehicles = new ArrayList<>();

    public VehicleInventory(List<Vehicle> vehicles) {
        this.vehicles.addAll(vehicles);
    }

    public void addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }
}
