public class Parent2 {
    void display() {
        System.out.println("This is the parent class method");
    }
}

class Child2 extends Parent2 {
    void display() {
        super.display();
        System.out.println("This is the child class method");
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.display();
    }
}