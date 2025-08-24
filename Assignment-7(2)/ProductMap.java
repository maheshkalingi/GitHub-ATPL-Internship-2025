
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 50000);
        productPrices.put("Mobile", 20000);
        productPrices.put("Headphones", 1500);
        productPrices.put("Keyboard", 800);
        Iterator<Map.Entry<String, Integer>> iterator = productPrices.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }
}