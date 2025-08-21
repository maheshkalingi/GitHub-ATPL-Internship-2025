import java.io.*;
import java.util.*;

public class WordFreq{
    public static void main(String[] args) throws IOException{
     File file= new File("input.txt");
     File file1= new File("Word_Frequencies.txt");
     FileWriter fw= new FileWriter(file);
     FileWriter fw1= new FileWriter(file1);
     fw.write("hii Hello How are you . Hello Mahesh WhatsApp ! Hello All");
     fw.close();

      Map<String,Integer>hm=new HashMap<>();


     try(BufferedReader br= new BufferedReader(new FileReader("input.txt"))){
        String line;
        while((line=br.readLine())!=null){
            String[] Words=line.toLowerCase().split(" ");
        
        for(String word:Words){
            hm.put(word,hm.getOrDefault(word, 0)+1);
        }
        }
     }

    List<Map.Entry<String,Integer>>sortedList=new ArrayList<>(hm.entrySet());
     sortedList.sort((a,b)-> b.getValue().compareTo(a.getValue()));
     try(BufferedWriter bw= new BufferedWriter(fw1)){
        for(Map.Entry<String,Integer> entry:sortedList){
           bw.write(entry.getKey() + ": " + entry.getValue());
           bw.newLine();
        }
     }
   catch (IOException e) {
            System.err.println("File error: " + e.getMessage());

    }
}
}