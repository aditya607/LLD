package carRentalSystem.Models;

public class Reservations {
    private String id;
    private String resvationTime;
    private String userId;
    private String returnTime;
    private Vehicle vehicle;

    public Reservations(String id, String resvationTime, String userId, String returnTime, Vehicle vehicle) {
        this.id = id;
        this.resvationTime = resvationTime;
        this.userId = userId;
        this.returnTime = returnTime;
        this.vehicle = vehicle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResvationTime() {
        return resvationTime;
    }

    public void setResvationTime(String resvationTime) {
        this.resvationTime = resvationTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
