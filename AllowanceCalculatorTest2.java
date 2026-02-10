

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AllowanceCalculatorTest2 {

    AllowanceCalculator calculator;

    // setUp
    @BeforeEach
    void setUp() {
        calculator = new AllowanceCalculator();
        System.out.println("Test Started");
    }

    // tearDown
    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Test Finished");
    }

    // normal test
    @Test
    void testCalculateAllowance() {
        double result = calculator.calculateAllowance(10000);

        // expected = 20% + 10% + 5% = 35% of 10000 = 3500
        assertTrue(result == 3500);
        assertFalse(result == 3000);
        assertNotEquals(4000, result);
    }

    // repeated test
    @RepeatedTest(3)
    void repeatedAllowanceTest() {
        double result = calculator.calculateAllowance(20000);
        assertTrue(result == 7000);
    }

    // raise exception if test fails
    @Test
    void exceptionTest() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });
    }
}
