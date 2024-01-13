package vehicle.fourWheelerVehicle;

import driveStrategy.DriveStrategy;
import driveStrategy.impl.FourWheelerDrive;
import vehicle.Vehicle;

public class Car extends Vehicle {
    public Car(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public Car() {
        super(new FourWheelerDrive());
    }
}
