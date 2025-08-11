package A;

public class A {
    protected int proVar = 10;
     int defaultVar = 4;
    public int x=7;

    public void display() {
        System.out.println(proVar);
        System.out.println(defaultVar);
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}
