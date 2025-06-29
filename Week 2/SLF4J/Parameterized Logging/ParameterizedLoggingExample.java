import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "varshini";
        int loginAttempts = 3;

        logger.info("User {} has attempted to login {} times", username, loginAttempts);
        logger.warn("User {} is close to being locked out", username);
        logger.error("Login failed for user {} after {} attempts", username, loginAttempts);
    }
}
