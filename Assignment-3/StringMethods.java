import java.util.*;
public class StringMethods {
    String Content;
    StringMethods(String content){
        this.Content=content;
    }
     public void usingTrim(){
        System.out.println("By Using Trim() Method :"+Content.trim());
     }
     public void usingLower(){
        System.out.println(" By Using toLowerCase() Method: "+Content.toLowerCase());
     }
      public void usingUpper(){
        System.out.println(" By Using toUpperCase() Method: "+Content.toUpperCase());
     }
     public void usingReplace(){
         System.out.println(" By Using replace() Method: "+Content.replace(" ","_"));
     }
     public void usingSubString(){
          System.out.println(" By Using substring() Method: "+Content.substring(0,4));  
     }
     public void usingIndexof(){
          System.out.println(" By Using indexOf() Method: "+Content.indexOf('a'));
     }
}
class StrM{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter something: ");
        String Word=sc.nextLine();
        StringMethods stm=new StringMethods(Word);
        stm.usingTrim();
        stm.usingLower();
        stm.usingUpper();
        stm.usingReplace();
        stm.usingSubString();
        stm.usingIndexof();

    }
    
}