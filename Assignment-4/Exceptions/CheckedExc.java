package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExc {
public static  void loadFile(String Path) throws FileNotFoundException, IOException{
    try(FileInputStream f= new FileInputStream(Path)){
        int line;
        while((line=f.read())!=-1){
         char ch=(char)line;
             System.out.println(ch);
        }
        System.out.println("file is Existed!");
    }
    catch(IOException e){
        System.out.println("I/O exception occured!");
    }
    catch(FileNotFoundException fe){
        System.out.println("FIleNotFOund  exception occured!");
    }
}
public static void main(String[] args) throws FileNotFoundException, IOException{
    loadFile("software.txt");
}
}