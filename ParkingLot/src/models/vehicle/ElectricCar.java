package models.vehicle;

import enums.VehicleType;

public class ElectricCar extends Vehicle {
    public ElectricCar(String vehicleNumber) {
        super(vehicleNumber, VehicleType.ELECTRIC_CAR);
    }
}
