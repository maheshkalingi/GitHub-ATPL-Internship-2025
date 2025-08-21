 import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Message : ");
        String message = scanner.nextLine();
        scanner.close();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("encrypted.txt"));
            for(int index = 0; index < message.length(); index++){
                bw.write(message.charAt(index)+6);
                
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}