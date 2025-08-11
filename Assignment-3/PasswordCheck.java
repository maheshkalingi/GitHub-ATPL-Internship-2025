import java.util.Scanner;

public class PasswordCheck {

    public static String encrypt(String input) {
        String encrypted = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            encrypted += input.charAt(i);
        }
        return encrypted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String originalPassword = scanner.nextLine();

        String encryptedPassword = encrypt(originalPassword);

        System.out.println("Encrypted password: " + encryptedPassword);
        System.out.println("Original password : " + originalPassword);

        scanner.close();
    }
}
