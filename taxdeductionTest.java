import org.junit.*;

public class taxdeductionTest {

    // Runs before EACH test
    @Before
    public void setUp() {
        System.out.println("Setting up test data");
    }

    // Main test case
    @Test
    public void testCalculateTax() {

        Assert.assertEquals(1350.0,
                taxdeduction.calculateTax(10000, 3500),
                0.001);

        Assert.assertEquals(675.0,
                taxdeduction.calculateTax(5000, 1750),
                0.001);

        Assert.assertEquals(0.0,
                taxdeduction.calculateTax(0, 0),
                0.001);
    }

    // assertTrue example
    @Test
    public void testTaxIsPositive() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assert.assertTrue(tax > 0);
    }

    // assertFalse example
    @Test
    public void testTaxIsNotNegative() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assert.assertFalse(tax < 0);
    }

    // assertNotEquals example
    @Test
    public void testTaxNotEqualWrongValue() {
        double tax = taxdeduction.calculateTax(10000, 2000);
        Assert.assertNotEquals(500.0, tax, 0.001);
    }

    // Exception test
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSalaryException() {
        taxdeduction.calculateTax(-5000, 1000);
    }

    // Repeat test (manual repetition)
    @Test
    public void repeatTest() {
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(675.0,
                    taxdeduction.calculateTax(5000, 1750),
                    0.001);
        }
    }

    // Runs after EACH test
    @After
    public void tearDown() {
        System.out.println("Cleaning up after test");
    }
}
