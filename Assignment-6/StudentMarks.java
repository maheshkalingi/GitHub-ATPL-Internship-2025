import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args){
       Map<String,Integer> hm=new HashMap<>();
       hm.put("Mahesh",85);
       hm.put("Dhileep",75);
       hm.put("Naveen",60);
       hm.put("Manoj",90);
       hm.put("Sandeeep",65);
       int Highest=Collections.max(hm.values());
       int Lowest=Collections.min(hm.values());
    }
}
