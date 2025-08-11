public class UserProfile {
    private String username;
    private String email;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        if (username == null ) {
            System.out.println("Username cannot be empty.");
        } else {
            this.username = username;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null || !email.matches(".+@.+\\..+")) {
            System.out.println("Please enter a valid email.");
        } else {
            this.email = email;
        }
    }
    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            System.out.println("Password must be at least 6 characters .");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
class Main {
    public static void main(String[] args) {
        UserProfile u = new UserProfile();
        u.setEmail("mahesh@gmail.com");
        u.setPassword("Mahesh@571");
        u.setUsername("Mahesh");
        System.out.println(u.getUsername());
        System.out.println(u.getEmail());
        System.out.println(u.getPassword());
    }
}