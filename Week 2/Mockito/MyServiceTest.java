import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class); // Step 1
        when(mockApi.getData()).thenReturn("Mock Data"); // Step 2
        MyService service = new MyService(mockApi); // Injecting mock
        String result = service.fetchData(); // Step 3
        assertEquals("Mock Data", result);
    }
}
