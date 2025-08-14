import java.util.Scanner;
import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to add:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s1.push(sc.nextInt());
        }
        //s1.pop();
        //s1.pop();
        //System.out.println(" Elements : " + s1);
        System.out.println("Enter how many elements you want to delete:");
        int k = sc.nextInt();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < k; i++) {
            s2.push(sc.nextInt());
        }
        Stack<Integer> s3 = new Stack<>();
        while (!s1.isEmpty()) {
            int val = s1.pop();
            if (!s2.contains(val)) {
                s3.push(val);
            }
        }
        while (!s3.isEmpty()) {
            s1.push(s3.pop());
        }
        System.out.println("Remaining Elements : " + s1);
        sc.close();
    }
}