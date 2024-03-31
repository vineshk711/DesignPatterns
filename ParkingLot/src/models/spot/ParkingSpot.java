package models.spot;

import enums.ParkingSpotType;
import models.vehicle.Vehicle;

public abstract class ParkingSpot {
    private String parkingSpotId;
    private String parkingFloorId;
    private boolean isSpotAvailable;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;

    public String getParkingSpotId() { return this.parkingSpotId; }
    public String getParkingFloorId() { return parkingFloorId; }
    public boolean isSpotAvailable() { return this.isSpotAvailable; }
    public Vehicle getVehicleDetails() { return this.vehicle; }

    public ParkingSpotType getParkingSpotType() { return this.parkingSpotType; }

    public void parkVehicle(Vehicle vehicle) {
        this.isSpotAvailable = false;
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.isSpotAvailable = true;
        this.vehicle = null;
    }

}
