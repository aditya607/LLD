package carRentalSystem.Utils;

import carRentalSystem.Models.Vehicle;

import java.util.List;
import java.util.Optional;

public class VehicleUtiltiy {

    public static Optional<Vehicle> getVehicleByID(List<Vehicle> vehicles, String id) {

        for(Vehicle vehicle: vehicles) {
            if(id.equalsIgnoreCase(vehicle.getId())) {
                synchronized(Vehicle.class) {

                }
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }
}
