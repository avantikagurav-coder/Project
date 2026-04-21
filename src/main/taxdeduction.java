package src.main;
public class taxdeduction {

    private static final double TAX_RATE = 0.2076923077; 

    public static double calculateTax(double salary, double deduction) {

        if (salary < 0 || deduction < 0) {
            throw new IllegalArgumentException("Salary or deduction cannot be negative");
        }

        double taxableIncome = salary - deduction;

        if (taxableIncome <= 0) {
            return 0.0;
        }

        double tax = taxableIncome * TAX_RATE;

        // Round to 2 decimal places
        tax = Math.round(tax * 100.0) / 100.0;

        return tax;
    }
}
