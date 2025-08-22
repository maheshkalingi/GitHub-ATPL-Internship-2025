import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class StringFormat {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(System.in);
        PrintWriter pw= new PrintWriter("stustringFormat.txt");
        System.out.println("Enter number of Student Details You Want to enter: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter the student Details of "+i+" :");
            System.out.println("Enter The Name: ");
            String name=sc.next();
            System.out.println("Enter The Age: ");
            int Age=sc.nextInt();
            System.out.println("Enter The Department: ");
            String dept=sc.next();
            System.out.println("Enter The GPA: ");
            float GPA=sc.nextFloat();
            pw.write(String.format());
        }
        

    }
}
