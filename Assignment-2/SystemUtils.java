public class SystemUtils {
    static class Logger {
        static void log(String message) {
            System.out.println("LOG: " + message);
        }
    }
    public static void main(String[] args) {
        SystemUtils.Logger.log("Application started");
        SystemUtils.Logger.log("Performing some operations");
        SystemUtils.Logger.log("Application ended");
    }
}