package carRentalSystem.Models;

import carRentalSystem.inventory.VehicleInventory;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private String id;
    private VehicleInventory vehicleInventory;

    private List<Reservations> reservationsList = new LinkedList<Reservations>();

    private String city;

    public Store(String id, VehicleInventory vehicleInventory , String city) {
        this.id = id;
        this.vehicleInventory = vehicleInventory;
        this.city = city;
    }

    public void addReservation(Reservations reservations) {
        this.reservationsList.add(reservations);
    }







    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public List<Reservations> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservations> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
