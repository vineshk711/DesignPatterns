package vehicle.twoWheelerVehicle;

import driveStrategy.DriveStrategy;
import driveStrategy.impl.DriveTwoWheeler;
import vehicle.Vehicle;

public class Bicycle extends Vehicle {

    public Bicycle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public Bicycle() {
        super(new DriveTwoWheeler());
    }
}
