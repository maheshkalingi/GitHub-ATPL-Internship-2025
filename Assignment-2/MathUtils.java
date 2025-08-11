public class MathUtils {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(" The Addition of two numbers is : " + m.calculate(3, 5));
        System.out.println(" The Multiplication of two Numbers is : " + m.calculate(5.0, 6.0));
    }
}