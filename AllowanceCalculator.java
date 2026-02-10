public class AllowanceCalculator {

    public double calculateAllowance(double basicSalary) {

        double hra = 0.20 * basicSalary;
        double da  = 0.10 * basicSalary;
        double ta  = 0.05 * basicSalary;

        return hra + da + ta;
    }
}
