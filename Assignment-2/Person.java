public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Hi, I am " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    public void details() {
        System.out.println("Hello everyone, I am a Student and My Name is :" + name);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

class Teacher extends Student {
    Teacher(String name) {
        super(name);
    }

    @Override
    public void details() {
        System.out.println("Good morning, I am your Teacher and My Name is: " + name);
    }

    public void teach() {
        System.out.println(name + " is teaching.");
    }
}

class per {
    public static void main(String[] args) {
        Person p = new Person("Mahesh");
        p.details();
        Student s = new Student("Aditya");
        s.details();
        s.study();
        Teacher t = new Teacher("Preneeth");
        t.details();
        t.teach();
    }
}