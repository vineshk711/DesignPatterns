package vehicle.twoWheelerVehicle;

import driveStrategy.DriveStrategy;
import driveStrategy.impl.DriveTwoWheeler;
import vehicle.Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public Motorcycle() {
        super(new DriveTwoWheeler());
    }
}
