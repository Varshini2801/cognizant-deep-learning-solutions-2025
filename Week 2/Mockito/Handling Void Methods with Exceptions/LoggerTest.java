import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @Test
    public void testVoidMethodThrowsException() throws Exception {
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub the void method to throw an exception
        doThrow(new RuntimeException("Logging failed")).when(mockLogger).log("ERROR");

        // Step 3: Verify the exception is thrown when method is called
        Exception exception = assertThrows(RuntimeException.class, () -> {
            mockLogger.log("ERROR");
        });

        // Assert message
        assertEquals("Logging failed", exception.getMessage());

        // Verify interaction
        verify(mockLogger).log("ERROR");
    }
}
