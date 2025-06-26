import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method for any string
        when(mockApi.getData(anyString())).thenReturn("Mock Response");

        // Step 3: Call method with a specific argument
        MyService service = new MyService(mockApi);
        String result = service.fetchData("user123");

        // Step 4: Verify the interaction using argument matcher
        verify(mockApi).getData(eq("user123"));
    }
}
