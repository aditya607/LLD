package carRentalSystem;

import carRentalSystem.Dao.daoImpl.UserDaoImpl;
import carRentalSystem.Models.Reservations;
import carRentalSystem.Models.Store;
import carRentalSystem.Models.Vehicle;
import carRentalSystem.Utils.InitialResourceAddition;
import carRentalSystem.Utils.VehicleUtiltiy;
import carRentalSystem.inventory.CarRentalSystemInventory;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CarRentalSystem {

    private static CarRentalSystemInventory carRentalSystemInventory;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        carRentalSystemInventory = new CarRentalSystemInventory(new UserDaoImpl());

        //adding initial data
        InitialResourceAddition.addFewInitailStore(carRentalSystemInventory);
        InitialResourceAddition.addFewUsers(carRentalSystemInventory);

        //
        while(true) {
            System.out.println("city name :: ");
            String city = scanner.next();

            Optional<Store> optionalStore = carRentalSystemInventory.getStoreForCity(city);
            if (optionalStore.isEmpty()) {
                System.out.println("sorry no store is present in the city " + city);
                break;
            }
            Store store = optionalStore.get();

            // printing all the vehicles
            List<Vehicle> vehicles = store.getVehicleInventory().getAllVehicles();
            System.out.println("all vechiles present in the store");
            for(Vehicle vehicle: vehicles) {
                System.out.println("id : " + vehicle.getId() + " " + vehicle.getType().name() + " vehicle_name " + vehicle.getVehicleName());
            }

            System.out.println("please select the vehicle");
            String vehicleId = scanner.next();
            Optional<Vehicle> optionalVehicle = VehicleUtiltiy.getVehicleByID(vehicles, vehicleId);
            if(optionalVehicle.isEmpty()) {
                System.out.println("wrong selection");
                break;
            }

            //reserving vehicle
            Reservations reservation = new Reservations("1", LocalDateTime.now().toString(), "user1", "abc", optionalVehicle.get() );
            store.addReservation(reservation);

            System.out.println("your car has been reserved, Thank you");

            break;

        }



    }






}
