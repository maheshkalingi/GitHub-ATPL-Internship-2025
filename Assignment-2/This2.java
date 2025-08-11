public class This2 {
    String brand;
    int year;

    This2() {
        brand = "Unknown";
        year = 0;
    }

    This2(String b, int y) {
        brand = b;
        year = y;
    }

    void showInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        This2 c1 = new This2();
        This2 c2 = new This2("Toyota", 2020);
        c1.showInfo();
        c2.showInfo();
    }
}