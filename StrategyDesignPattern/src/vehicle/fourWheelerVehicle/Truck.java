package vehicle.fourWheelerVehicle;

import driveStrategy.DriveStrategy;
import driveStrategy.impl.FourWheelerDrive;
import vehicle.Vehicle;

public class Truck extends Vehicle {

    public Truck(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public Truck() {
        super(new FourWheelerDrive());
    }
}
