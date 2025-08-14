import java.util.ArrayList;
import java.util.Scanner;

class arrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of names to be add:");
        int n = sc.nextInt();
        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        System.out.println("Before Removing Elements");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        names.remove(3);
        System.out.println();
        System.out.println("After Removing 3rd Element: ");
        for (String Nam : names) {
            System.out.println(Nam);
        }
        sc.close();
        
    }
}
