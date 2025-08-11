public class Circle {
    private double radius;
    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius should be greater than 0");
        }
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getCircumference() {
        return 2 * 3.14 * radius;
    }
}
class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println(" Area: " + c.getArea());
        System.out.println("Circumference:" + c.getCircumference());
    }
}