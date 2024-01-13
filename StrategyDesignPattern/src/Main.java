import driveStrategy.impl.DriveTruck;
import vehicle.Vehicle;
import vehicle.fourWheelerVehicle.Car;
import vehicle.fourWheelerVehicle.Truck;
import vehicle.twoWheelerVehicle.Bicycle;
import vehicle.twoWheelerVehicle.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();
        Car car = new Car();
        Truck tataTruck = new Truck(new DriveTruck());
        Truck eicherTruck = new Truck();
        motorcycle.drive();
        bicycle.drive();
        car.drive();
        tataTruck.drive();
        eicherTruck.drive();
    }
}
