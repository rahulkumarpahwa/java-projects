

// Interface for basic vehicle operations
interface Vehicle {
    void start();
}

// Interface for fuel-based vehicles
interface FuelVehicle {
    void refuel();
}

// Class representing a conventional car
class Car implements Vehicle, FuelVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + ": Engine started with ignition key");
    }

    @Override
    public void refuel() {
        System.out.println(model + ": Refueling with petrol/diesel at the fuel station");
    }

    // Additional methods
    public void drive() {
        System.out.println(model + ": Car is being driven");
    }
}

// Class representing an electric car
class ElectricCar implements Vehicle {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + ": Electric motor activated with push button");
    }

    // Additional methods specific to electric cars
    public void charge() {
        System.out.println(model + ": Charging at an electric station");
    }
}

// Main class to test the vehicle system
public class VehicleSystem {
    public static void main(String[] args) {
        System.out.println("VEHICLE SYSTEM DEMONSTRATION");
        System.out.println("===========================");

        // Create a conventional car
        Car myCar = new Car("Toyota Camry");
        System.out.println("Conventional Car Operations:");
        myCar.start();
        myCar.drive();
        myCar.refuel();

        System.out.println("\n------------------\n");

        // Create an electric car
        ElectricCar myElectricCar = new ElectricCar("Tesla Model 3");
        System.out.println("Electric Car Operations:");
        myElectricCar.start();
        myElectricCar.charge();

        System.out.println("\n------------------\n");

        // Demonstrate polymorphism with Vehicle interface
        System.out.println("Polymorphism Demonstration:");
        Vehicle vehicle1 = new Car("Honda Civic");
        Vehicle vehicle2 = new ElectricCar("Nissan Leaf");

        vehicle1.start(); // Will call Car's implementation
        vehicle2.start(); // Will call ElectricCar's implementation
    }
}
