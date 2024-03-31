package models.vehicle;

import enums.VehicleType;

public class MotorBike extends  Vehicle {

    public MotorBike(String vehicleNumber) {
        super(vehicleNumber, VehicleType.MOTORCYCLE);
    }
}
