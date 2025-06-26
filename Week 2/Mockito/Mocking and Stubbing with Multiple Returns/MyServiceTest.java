import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);

        // Return "Pending" on first call, "Processing" on second, "Completed" on third
        when(mockApi.fetchStatus())
            .thenReturn("Pending")
            .thenReturn("Processing")
            .thenReturn("Completed");

        MyService service = new MyService(mockApi);

        assertEquals("Pending", service.checkStatus());
        assertEquals("Processing", service.checkStatus());
        assertEquals("Completed", service.checkStatus());
    }
}
