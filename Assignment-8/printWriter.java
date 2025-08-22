import java.io.*;
import java.util.*;

public class printWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("StDetails.txt");
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of student details you want to enter: ");
                    int n= sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("enter the Student details of"+" "+(i+1)+":");
                        System.out.println("Enter The Name: ");
                        String name=sc.next();

                        System.out.println("Enter The Age: ");
                        int Age=sc.nextInt();

                        System.out.println("Enter The Department: ");
                        String dept=sc.next();

                        System.out.println("Enter The GPA: ");
                        float GPA=sc.nextFloat();
            pw.printf("[name=%s,age=%d,dept=%s,GPA=%.2f]",name,Age,dept,GPA);
            System.out.println();
        }
    pw.close();
    System.out.println("Successful!");

    }           
    }
