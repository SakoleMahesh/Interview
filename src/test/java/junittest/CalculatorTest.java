package junittest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    // Create an instance of the Calculator class
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        // Test addition
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    void testSubtract() {
        // Test subtraction
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-5, calculator.subtract(0, 5), "0 - 5 should equal -5");
    }

    @Test
    void testMultiply() {
        // Test multiplication
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    void testDivide() {
        // Test division
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should equal -2");

        // Test division by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}