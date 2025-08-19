import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}