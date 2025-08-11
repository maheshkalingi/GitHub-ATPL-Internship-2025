public abstract class Appliance {
    public abstract void turnOn();

    public abstract void turnOff();
}
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}
class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF");
    }
}
class app {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();
        Appliance tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}