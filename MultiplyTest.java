import static org.junit.Assert.*;
import org.junit.*;

public class MultiplyTest {
    @Test
    public void testMultiply() {
        assertEquals(Multiply.multiply(2, 5), 10);
    }
}
