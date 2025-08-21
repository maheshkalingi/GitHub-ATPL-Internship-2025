import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatedFile {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        try(
            BufferedReader br= new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br1= new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter bw= new BufferedWriter(new FileWriter("concated.txt")); 
        ){
            String line;
            while((line=br.readLine())!=null){
              bw.write(line);
              
            }
             while((line=br1.readLine())!=null){
              bw.write(line);
              bw.newLine();
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("FilenotFound Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception Error: " + e.getMessage());
        }
    }
}
