import java.util.*;
public class PhoneDirectory {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }
    public static String searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            return "Contact found: " + name + " - " + phoneBook.get(name);
        } else {
            return "Contact not found for: " + name;
        }
    }
    public static String removeContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            return "Contact removed: " + name;
        } else {
            return "Contact not found for removal: " + name;
        }
    }
    public static void main(String[] args) {
        addContact("manoj", "8327542752");
        addContact("ajith", "8327542823");
        addContact("suryprakash", "7332573552");
        System.out.println(searchContact("manoj"));
        System.out.println(searchContact("ajith"));
        System.out.println(removeContact("ajith"));
        System.out.println(removeContact("suryprakash"));
        System.out.println(searchContact("ajith"));
    }
}