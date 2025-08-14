import java.util.*;
public class vectorExample {
public static void main(String[] args){
   Vector<Double> v1 = new Vector<Double>();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number of double numbers you want to add:");
    double n= sc.nextInt();
    for(int i=0;i<n;i++){
       v1.addElement(sc.nextDouble());
    }
   
     sc.close();  
    Enumeration<Double> e1 =Collections.enumeration(v1);
    while (e1.hasMoreElements())
                System.out.println("The element You have Entered  is: " + e1.nextElement());
        }
        
}


