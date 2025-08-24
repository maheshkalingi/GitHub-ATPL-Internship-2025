
public class primToWrapper {
    public static void main(String[] args) {
        int integerValue = 10;
        double doubleValue = 20.5;
        char charValue = 'A';
        boolean booleanValue = true;
        Integer integerObj = integerValue;
        Double doubleObj = doubleValue;
        Character charObj = charValue;
        Boolean booleanObj = booleanValue;
        System.out.println("Integer wrapper class: " + integerObj.getClass().getName());
        System.out.println("Double wrapper class: " + doubleObj.getClass().getName());
        System.out.println("Character wrapper class: " + charObj.getClass().getName());
        System.out.println("Boolean wrapper class: " + booleanObj.getClass().getName());
    }
}