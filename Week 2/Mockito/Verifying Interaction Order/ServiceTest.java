import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testInteractionOrder() {
        // Step 1: Create mock object
        Service mockService = mock(Service.class);

        // Step 2: Call methods in a specific order
        mockService.stepOne();
        mockService.stepTwo();
        mockService.stepThree();

        // Step 3: Verify the interaction order
        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).stepOne();
        inOrder.verify(mockService).stepTwo();
        inOrder.verify(mockService).stepThree();
    }
}
