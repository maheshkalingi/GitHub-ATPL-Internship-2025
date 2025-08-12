package ThrowandThrows;

import java.util.*;
public class IllegalException {
    static void checkPositive (int N) {
        if(N < 0){
          throw new IllegalArgumentException("Number Cannot Be A Negative .");
        }
        else{
               System.out.println("Number is Valid");
        }
   }
   public static void main(String[] args) throws Exception {
    System.out.println("Enter a Number:");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    try{
        checkPositive(n);
    }
    catch(IllegalArgumentException e){
         System.out.println(e);
    }
     sc.close();
   }
}