public class This {
    String name;
    This(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        This t = new This("Mahesh");
        t.display();
    }
}