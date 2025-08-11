package access1;

public class access2 extends access1 {
    public static void main(String[] args) {
        access1 a1 = new access1();
        System.out.println(a1.publicVar);
        System.out.println(a1.defaultVar);
        System.out.println(a1.protectedVar);
    }
}