package allowance;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AllowanceCalculatorTest {

    private AllowanceCalculator calculator;

    // setUp (runs before each test)
    @BeforeEach
    void setUp() {
        calculator = new AllowanceCalculator();
        System.out.println("Setup done");
    }

    // tearDown (runs after each test)
    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Cleanup done");
    }

    // Test normal case
    @Test
    void testCalculateAllowance() {
        double result = calculator.calculateAllowance(10000);

        // hra = 2000, da = 1000, ta = 500 → total = 3500
        assertEquals(3500, result, 0.001);
    }

    // Test with zero salary
    @Test
    void testZeroSalary() {
        double result = calculator.calculateAllowance(0);
        assertEquals(0, result);
    }

    // Test negative salary (edge case)
 @Test
void testNegativeSalary() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        calculator.calculateAllowance(-10000);
    });

    assertEquals("Salary cannot be negative", exception.getMessage());
}

    // assertTrue / assertFalse
    @Test
    void testAssertions() {
        double result = calculator.calculateAllowance(10000);

        assertTrue(result > 0);
        assertFalse(result < 0);
    }

    // assertNotEquals
    @Test
    void testNotEquals() {
        double result = calculator.calculateAllowance(10000);

        assertNotEquals(3000, result);
    }

    // Repeat test multiple times
    @RepeatedTest(3)
    void repeatTestExample() {
        double result = calculator.calculateAllowance(5000);

        // hra=1000, da=500, ta=250 → total=1750
        assertEquals(1750, result, 0.001);
    }

    // Raise exception if test fails (custom validation example)
    @Test
    void testException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            if (calculator.calculateAllowance(-1) < 0) {
                throw new IllegalArgumentException("Salary cannot be negative");
            }
        });

        assertEquals("Salary cannot be negative", exception.getMessage());
    }
}