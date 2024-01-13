import driveStrategy.impl.DriveTruck;
import driveStrategy.impl.DriveTwoWheeler;
import vehicle.fourWheelerVehicle.Car;
import vehicle.fourWheelerVehicle.Truck;
import vehicle.twoWheelerVehicle.Bicycle;
import vehicle.twoWheelerVehicle.Motorcycle;

/**
 * Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when we have multiple
 * algorithm for a specific task and client decides the actual implementation to be used at runtime
 * The Strategy pattern suggests that you take a class that does something specific in a lot of different
 * ways and extract all of these algorithms into separate classes called strategies.
 */

public class StrategyApplication {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        // decides implementation at runtime
        Bicycle bicycle = new Bicycle(new DriveTwoWheeler());
        Car car = new Car();

        // decides different implementation based on truck type
        Truck tataTruck = new Truck(new DriveTruck());
        Truck eicherTruck = new Truck();
        motorcycle.drive();
        bicycle.drive();
        car.drive();
        tataTruck.drive();
        eicherTruck.drive();
    }
}
