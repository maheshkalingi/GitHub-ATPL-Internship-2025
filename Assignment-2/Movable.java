public interface Movable {
    void move();
}

class Car implements Movable {
    public void move() {
        System.out.println("Car is moving on the road");
    }
}

class Robot implements Movable {
    public void move() {
        System.out.println("Robot is walking");
    }
}

class Drone implements Movable {
    public void move() {
        System.out.println("Drone is flying");
    }
}

class Main {
    public static void main(String[] args) {
        Movable car = new Car();
        Movable robot = new Robot();
        Movable drone = new Drone();

        car.move();
        robot.move();
        drone.move();
    }
}