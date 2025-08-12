package ThrowandThrows;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class IOEX {
    String Path;
    
    public static void readFile(String Path) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(Path));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("FIle read Successfully!");
        reader.close();
    }

    public static void main(String[] args) {
       try{
        readFile("nonExistent.txt");
       }
       catch(IOException e ){
        System.out.println(e);
       }
}
}
