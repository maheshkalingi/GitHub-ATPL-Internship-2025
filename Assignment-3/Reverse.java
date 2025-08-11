import java.util.Scanner;
public class Reverse {
    String userName;
    
    Reverse(String Name){
       this.userName=Name;
    }
    public void  usingBuilder(){
        StringBuilder builder=new StringBuilder(userName);
        System.out.println("This  Reversed String Using StringBuilder is: "+builder.reverse());
    }
    public void  usingBuffer(){
        StringBuffer buffer=new StringBuffer(userName);
        System.out.println("This  Reversed String Using StringBuffer is: "+buffer.reverse());
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        int name1=name.length();
        String ReversedWord="";
        for(int i=name1-1;i>=0;i--){
            ReversedWord+=name.charAt(i);
        }
        sc.close();
        System.out.println("This Reversed String  is using For Loop: "+ReversedWord); 
        Reverse rev= new Reverse(name);
        rev.usingBuilder();
        rev.usingBuffer();
    }
}