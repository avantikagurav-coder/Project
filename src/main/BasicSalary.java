import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");

        double salary;

        if (sc.hasNextDouble()) {
            salary = sc.nextDouble();
        } else {
            salary = 50000;
        }

        System.out.println("Basic Salary is: " + salary);

        sc.close();
    }
}
