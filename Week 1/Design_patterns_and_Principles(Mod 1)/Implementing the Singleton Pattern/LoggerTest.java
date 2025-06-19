public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Check if both references are the same
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance!");
        } else {
            System.out.println("Different instances exist! Singleton broken.");
        }
    }
}
