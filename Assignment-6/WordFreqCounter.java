import java.util.*;
public class WordFreqCounter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the Scentence to see the word Occurences:  ");
        String Scentence=sc.nextLine();
        Map<String,Integer>hm=new HashMap<>();
        for (String word : Scentence.split(" ")){
            hm.put(word,hm.getOrDefault(word,0 )+1);
        }
             System.out.println(hm);
             sc.close();
    }
}
