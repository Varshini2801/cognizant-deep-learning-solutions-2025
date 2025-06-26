import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// Simple Calculator class for testing
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class CalculatorTest {

    private Calculator calculator;

    // Setup method runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    // Teardown method runs after each test
    @After
    public void tearDown() {
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10, b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
