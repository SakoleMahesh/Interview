package junittest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Log {

    private static final Logger logger = LoggerFactory.getLogger(Log.class);
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        logger.info("Calculator instance created.");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        logger.info("Calculator instance destroyed.");
    }

    @Test
    void testAdd() {
        logger.debug("Running testAdd...");
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        logger.info("testAdd completed successfully.");
    }

    @Test
    void testSubtract() {
        logger.debug("Running testSubtract...");
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        logger.info("testSubtract completed successfully.");
    }

    @Test
    void testDivide() {
        logger.debug("Running testDivide...");
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
        logger.info("testDivide completed successfully.");
    }
}