import java.text.MessageFormat;

public class MessageFormat{
    public static void main(String[] args) {
        String name = "Mohan";
        String dept = "EEE";
        double gpa = 9.8;

        String summary = MessageFormat.format(
            "Student {0} from {1} department has secured a GPA of {2}.",
            name, dept, gpa
        );
        System.out.println(summary);
    }
}
