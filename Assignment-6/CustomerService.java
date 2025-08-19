 import java.util.*;
public class CustomerService {
   
    Queue<String> queue = new LinkedList<>();

    public void addCustomer(String name) {
        queue.add(name);
    }

    public String serveCustomer() {
        return queue.poll(); 
    }

    public String NextCustomer() {
        return queue.peek(); 
    }

    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        cs.addCustomer("Mahesh");
        cs.addCustomer("dileep");
        cs.addCustomer("Aditya");
        cs.addCustomer("Shyam");

        System.out.println("NextCustomer: " + cs.NextCustomer()); 
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("NextCustomer: " + cs.NextCustomer());
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("NextCustomer: " + cs.NextCustomer());
        System.out.println("Served: " + cs.serveCustomer());
    }
}

