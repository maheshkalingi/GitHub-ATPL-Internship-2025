public class Vehicle {
    void start() {
        System.out.println("This is Vehicle Class");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("This is Bike Class");
    }
}

class Car extends Bike {
    @Override
    void start() {
        System.out.println("This is Car Class");
    }
}

class vech {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start();
        Car c1 = new Car();
        c1.start();
    }
}