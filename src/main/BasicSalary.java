import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Basic Salary is: " + salary);

        sc.close();
    }
}
