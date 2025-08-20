import java.util.*;
public class CharCounter {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("ENter the scentence");
    String scentence=sc.nextLine();
    HashMap<Character,Integer>hm=new HashMap<>();
    for(char c :scentence.toCharArray()){
        if(c!=' '){
            hm.put(c,hm.getOrDefault(c, 0)+1);
        }
    }
    System.out.println(hm);
    }
}
