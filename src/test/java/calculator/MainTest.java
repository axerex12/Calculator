package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAddValues() {
        assertEquals(5.0, Main.addValues(2.0, 3.0), 1e-9);
    }

    @Test
    public void testMultiplyValues() {
        assertEquals(6.0, Main.multiplyValues(2.0, 3.0), 1e-9);
    }

    @Test
    public void testSubtractValues() {
        assertEquals(-1.0, Main.subtractValues(2.0, 3.0), 1e-9);
    }

    @Test
    public void testDivideValues() {
        assertEquals(2.0, Main.divideValues(6.0, 3.0), 1e-9);
    }

    @Test
    public void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> Main.divideValues(1.0, 0.0));
    }

    @Test
    public void testMixedPrecision() {
        assertEquals(0.3333333333, Main.divideValues(1.0, 3.0), 1e-9);
    }
}
