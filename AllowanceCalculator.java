import java.util.Scanner;

public class AllowanceCalculator {

    public static double calculateAllowance(double basicSalary) {

        double hra = 0.20 * basicSalary;
        double da  = 0.10 * basicSalary;
        double ta  = 0.05 * basicSalary;

        return hra + da + ta;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double totalAllowance = calculateAllowance(basicSalary);

        System.out.println("Total Allowance: " + totalAllowance);

        sc.close();
    }
}
