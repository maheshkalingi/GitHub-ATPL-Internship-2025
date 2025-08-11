public class Payment {
    public void processPayment() {
        System.out.println("Payment Method.");
    }
}
class CreditPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("CreditCard Payment Method. ");
    }
}
class UpiPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("UPI payment Method.");
    }
}
class pay {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.processPayment();
        Payment cp = new CreditPayment();
        cp.processPayment();
        Payment up = new UpiPayment();
        up.processPayment();
    }
}