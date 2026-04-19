public class NetSalary {

    public static double calculateNetSalary(double basic, double allowances, double tax) {

        // Validate inputs
        if (basic < 0) {
            throw new IllegalArgumentException("Basic salary cannot be negative");
        }

        if (allowances < 0) {
            throw new IllegalArgumentException("Allowances cannot be negative");
        }

        if (tax < 0) {
            throw new IllegalArgumentException("Tax cannot be negative");
        }

        double grossSalary = basic + allowances;

        // If tax is greater than gross salary, net salary should not be negative
        if (tax > grossSalary) {
            return 0;
        }

        return grossSalary - tax;
    }

    public static void main(String[] args) {
        double basic = 12000;
        double allowances = 3000;
        double tax = 1500;

        double netSalary = calculateNetSalary(basic, allowances, tax);

        System.out.println("Net Salary: " + netSalary);
    }
}
