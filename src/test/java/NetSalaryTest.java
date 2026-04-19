import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class NetSalaryTest {

    // setUp - runs before each test
    @BeforeEach
    void setUp() {
        System.out.println("Starting test...");
    }

    // Normal Test Case
    @Test
    void testNormalCase() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 500);
        assertEquals(11500, actual, 0.001);
    }

    @Test
    void testZeroValues() {
        double actual = NetSalary.calculateNetSalary(0, 0, 0);
        assertEquals(0, actual, 0.001);
    }

    @Test
    void testZeroTax() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 0);
        assertEquals(12000, actual, 0.001);
    }

    @Test
    void testLargeValues() {
        double actual = NetSalary.calculateNetSalary(100000, 50000, 20000);
        assertEquals(130000, actual, 0.001);
    }

    @Test
    void testDecimalValues() {
        double actual = NetSalary.calculateNetSalary(12345.5, 2345.75, 1000.25);
        assertEquals(13691.0, actual, 0.001);
    }

    @Test
    void testTaxGreaterThanSalary() {
        double actual = NetSalary.calculateNetSalary(5000, 1000, 10000);
        assertEquals(0, actual, 0.001);
    }

    // assertTrue example
    @Test
    void testSalaryPositive() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 500);
        assertTrue(actual > 0);
    }

    // assertFalse example
    @Test
    void testSalaryNotPositive() {
        double actual = NetSalary.calculateNetSalary(5000, 1000, 10000);
        assertFalse(actual > 0);
    }

    // assertNotEquals example
    @Test
    void testNotEquals() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 500);
        assertNotEquals(5000, actual);
    }

    // Repeated Test
    @RepeatedTest(3)
    void repeatedTest() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 500);
        assertEquals(11500, actual, 0.001);
    }

    // Exception Tests
    @Test
    void testNegativeBasicSalary() {
        assertThrows(IllegalArgumentException.class, () -> {
            NetSalary.calculateNetSalary(-1000, 2000, 500);
        });
    }

    @Test
    void testNegativeAllowances() {
        assertThrows(IllegalArgumentException.class, () -> {
            NetSalary.calculateNetSalary(1000, -2000, 500);
        });
    }

    @Test
    void testNegativeTax() {
        assertThrows(IllegalArgumentException.class, () -> {
            NetSalary.calculateNetSalary(1000, 2000, -500);
        });
    }

    // tearDown - runs after each test
    @AfterEach
    void tearDown() {
        System.out.println("Test finished.");
    }
}