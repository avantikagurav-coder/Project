package allowance;
public class AllowanceCalculator {

    public double calculateAllowance(double basicSalary) {

        if (basicSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        double hra = 0.20 * basicSalary;
        double da  = 0.10 * basicSalary;
        double ta  = 0.05 * basicSalary;

        return hra + da + ta;
    }
}