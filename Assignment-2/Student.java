public class Student {
    static String schoolName;
    String studentName;
    Student(String name) {
        studentName = name;
    }
    void displayInfo() {
        System.out.println("Name: " + studentName + ", School: " + schoolName);
    }
    public static void main(String[] args) {
        Student.schoolName = "NxtWave";
        Student s1 = new Student("Mahesh");
        Student s2 = new Student("Aditya");
        s1.displayInfo();
        s2.displayInfo();
        s1.schoolName = "unacademy";
        s1.displayInfo();
        s2.displayInfo();
    }
}