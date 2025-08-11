interface Greeting {
    public abstract void sayhello();
}

public class Anonymous1 {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayhello() {
                System.out.println("Hello!");
            }
        };
        g.sayhello();
    }
}