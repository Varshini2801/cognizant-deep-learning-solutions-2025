import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AuditServiceTest {

    @Test
    public void testVoidMethod() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub the void method (optional here since no behavior change)
        doNothing().when(mockLogger).log(anyString());

        // Step 3: Use the class and verify the interaction
        AuditService service = new AuditService(mockLogger);
        service.performAction();

        // Step 4: Verify log was called with specific argument
        verify(mockLogger).log("Action performed");
    }
}
