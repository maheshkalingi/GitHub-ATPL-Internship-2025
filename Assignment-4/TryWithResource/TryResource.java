package TryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResource{
    public static void readFileSafely(String Path) throws FileNotFoundException, IOException{
        try(BufferedReader reader =new BufferedReader(new FileReader(Path))){
            String line;
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws  IOException {
        readFileSafely("sample.txt");
    }
}

