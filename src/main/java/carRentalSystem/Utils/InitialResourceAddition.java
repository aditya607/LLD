package carRentalSystem.Utils;

import carRentalSystem.Models.Car;
import carRentalSystem.Models.Store;
import carRentalSystem.Models.User;
import carRentalSystem.Models.Vehicle;
import carRentalSystem.inventory.CarRentalSystemInventory;
import carRentalSystem.inventory.VehicleInventory;

import java.util.ArrayList;

public class InitialResourceAddition {

    public static void addFewInitailStore(CarRentalSystemInventory carRentalSystemInventory) {
        VehicleInventory vehicleInventory = new VehicleInventory(new ArrayList<>());
        Vehicle vehicle1 = new Car("1", "car1", "car1-2-3", 1200);
        Vehicle vehicle2 = new Car("2", "car2", "car1-2-4", 900);
        vehicleInventory.addVehicles(vehicle1);
        vehicleInventory.addVehicles(vehicle2);

        Store store1= new Store("1", vehicleInventory, "Delhi");
        carRentalSystemInventory.addStores(store1);
    }

    public static void addFewUsers(CarRentalSystemInventory carRentalSystemInventory) {
        User user1 = new User("user1", "drivinglicense1");
        User user2 = new User("user2", "drivinglicense2");
        carRentalSystemInventory.addUsers(user1);
        carRentalSystemInventory.addUsers(user2);
    }
}
