package access3;
import access1.*;
public class access3 extends access1 {
    public static void main(String[] args) {
        access3 a3 = new access3();
        System.out.println(a3.publicVar);
        
        System.out.println(a3.protectedVar);
    }
}