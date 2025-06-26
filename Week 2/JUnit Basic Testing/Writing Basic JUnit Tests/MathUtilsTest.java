import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mu = new MathUtils();
        assertEquals(5, mu.add(2, 3));
    }

    @Test
    public void testMultiply() {
        MathUtils mu = new MathUtils();
        assertEquals(20, mu.multiply(4, 5));
    }

    @Test
    public void testIsEven() {
        MathUtils mu = new MathUtils();
        assertTrue(mu.isEven(4));
        assertFalse(mu.isEven(5));
    }
}
