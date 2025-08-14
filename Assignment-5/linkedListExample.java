import java.util.LinkedList;

public class linkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> Nums = new LinkedList<Integer>();

        Nums.add(10);
        Nums.add(20);
        Nums.add(30);
        Nums.add(40);
        Nums.add(50);
        System.out.println("Starting Elements :");
         for (int i = 0; i < Nums.size(); i++) {
            System.out.print(Nums.get(i) + " ");
        }
        Nums.addFirst(5);
        Nums.addLast(60);
        System.out.println();
        System.out.println("After Adding all the Numbers:");
        for (int i = 0; i < Nums.size(); i++) {
            System.out.print(Nums.get(i) + " ");
        }
        System.out.println();
        System.out.println("After Removing Index 2");
        Nums.remove(2);
        for (int i = 0; i < Nums.size(); i++) {
            System.out.print(Nums.get(i) + " ");
        }

    }
}
