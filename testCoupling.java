interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine started");
    }
}

class Car {
    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class testCoupling {
    public static void main(String[] args) {

        Engine e1 = new PetrolEngine();
        Car car1 = new Car(e1);
        car1.drive();

        Engine e2 = new DieselEngine();
        Car car2 = new Car(e2);
        car2.drive();
    }
}
