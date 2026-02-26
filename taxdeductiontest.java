import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class taxdeductiontest {

    @BeforeEach
    void setUp() {
        System.out.println("Setting up test data");
    }

    @Test
    void testCalculateTax() {

        Assertions.assertEquals(1350.0,
                taxdeduction.calculateTax(10000, 3500),
                0.001);

        Assertions.assertEquals(675.0,
                taxdeduction.calculateTax(5000, 1750),
                0.001);

        Assertions.assertEquals(0.0,
                taxdeduction.calculateTax(0, 0),
                0.001);
    }

    @Test
    void testTaxIsPositive() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assertions.assertTrue(tax > 0);
    }

    @Test
    void testTaxIsNotNegative() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assertions.assertFalse(tax < 0);
    }

    @Test
    void testTaxNotEqualWrongValue() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assertions.assertNotEquals(500.0, tax, 0.001);
    }

    @Test
    void testNegativeSalaryException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            taxdeduction.calculateTax(-5000, 1000);
        });
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test");
    }
}

