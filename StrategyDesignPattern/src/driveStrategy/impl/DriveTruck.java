package driveStrategy.impl;

import driveStrategy.DriveStrategy;

public class DriveTruck implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Truck is driving....");
    }
}
