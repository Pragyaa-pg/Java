abstract class Vehicle {

    // abstract method (no body)
    abstract void start();

    // normal method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {

    // implementation provided
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with kick or button");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
