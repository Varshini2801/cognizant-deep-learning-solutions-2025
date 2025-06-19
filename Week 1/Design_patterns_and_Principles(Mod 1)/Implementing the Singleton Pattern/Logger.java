public class Logger {
    // Step 1: private static instance
    private static Logger instance;

    // Step 2: private constructor
    private Logger() {
        System.out.println("Logger initialized!");
    }

    // Step 3: public static method to get instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Optional: a logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
