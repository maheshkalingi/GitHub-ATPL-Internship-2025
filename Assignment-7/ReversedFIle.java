import java.io.*;

public class ReversedFIle {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        try( 
            BufferedReader br= new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw= new BufferedWriter(new FileWriter("reversed.txt"));
        ) 
        {
            String line;
            while((line=br.readLine())!=null){
              bw.write(new StringBuilder(line).reverse().toString());
              bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println("IO exception occured: "+e);
        }
    }
}
