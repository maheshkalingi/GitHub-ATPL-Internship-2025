public class Display {
    public void show(int value) {
        System.out.println("Integer: " + value);
    }

    public void show(String value) {
        System.out.println("String: " + value);
    }

    public void show(int[] values) {
        System.out.print("Integer Array: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.show(12);
        d.show("Mahesh");
        d.show(new int[] { 10, 20, 30, 40 });
    }
}