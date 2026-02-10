import org.junit.Test;
import org.junit.Assert;

public class AllowanceCalculatorTest {

    @Test
    public void testCalculateAllowance() {

        AllowanceCalculator calc = new AllowanceCalculator();

        Assert.assertEquals(3500.0, calc.calculateAllowance(10000), 0.001);
        Assert.assertEquals(1750.0, calc.calculateAllowance(5000), 0.001);
        Assert.assertEquals(0.0,    calc.calculateAllowance(0), 0.001);
    }
}
