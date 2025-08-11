abstract class Shape {
    void draw() {

    }
}

public class Anonymous2 extends Shape {
    public static void main(String[] args) {
        Shape s = new Shape() {
            void draw() {
                System.out.println("drawing");
            }
        };
        s.draw();
    }
}