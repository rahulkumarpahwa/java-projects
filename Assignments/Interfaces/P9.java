public class P9 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}

interface Vehicle {

    public void start();

    public void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The Car Starts.");
    }

    @Override
    public void stop() {
        System.out.println("The Car Stops.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("The Bike Starts.");
    }

    @Override
    public void stop() {
        System.out.println("The Bike Stops.");
    }
}