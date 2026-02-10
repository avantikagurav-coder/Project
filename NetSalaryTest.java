import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NetSalaryTest {

    @Test
    public void testNormalCase() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 500);
        assertEquals(11500, actual, 0.001);
    }

    @Test
    public void testZeroValues() {
        double actual = NetSalary.calculateNetSalary(0, 0, 0);
        assertEquals(0, actual, 0.001);
    }

    @Test
    public void testZeroTax() {
        double actual = NetSalary.calculateNetSalary(10000, 2000, 0);
        assertEquals(12000, actual, 0.001);
    }

    @Test
    public void testLargeValues() {
        double actual = NetSalary.calculateNetSalary(100000, 50000, 20000);
        assertEquals(130000, actual, 0.001);
    }

    @Test
    public void testDecimalValues() {
        double actual = NetSalary.calculateNetSalary(12345.5, 2345.75, 1000.25);
        assertEquals(13691.0, actual, 0.001);
    }

    @Test
    public void testTaxGreaterThanSalary() {
        double actual = NetSalary.calculateNetSalary(5000, 1000, 10000);
        assertEquals(0, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeBasicSalary() {
        NetSalary.calculateNetSalary(-1000, 2000, 500);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeAllowances() {
        NetSalary.calculateNetSalary(1000, -2000, 500);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTax() {
        NetSalary.calculateNetSalary(1000, 2000, -500);
    }
}
