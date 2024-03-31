package models.vehicle;

import enums.VehicleType;

public abstract class Vehicle {
    private String vehicleNumber;
    private VehicleType type;

    public Vehicle(String vehicleNumber, VehicleType type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public VehicleType getType() { return this.type; }
    public String getVehicleNumber() { return this.vehicleNumber; }
}
