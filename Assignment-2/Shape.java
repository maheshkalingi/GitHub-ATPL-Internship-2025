public abstract class Shape {
    public abstract double area();
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
class shap {
    public static void main(String[] args) {
        Shape s1 = new Square(7);
        Shape s2 = new Triangle(3, 5);
        System.out.println("The area of Square: " + s1.area());
        System.out.println("The Area of Triangle is :" + s2.area());
    }
}