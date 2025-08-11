public class Final {
    final void showMessage() {
        System.out.println("This is a final method from the Final class");
    }
}
class Child extends Final {
    void showMessage() {
        System.out.println("Trying to override final method in Child class");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();
    }
}