import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get employee details
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter deductions: ");
        double deductions = sc.nextDouble();

        // Calculate salary
        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - deductions;

        // Display result
        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Deductions    : " + deductions);
        System.out.println("Net Salary    : " + netSalary);

        sc.close();
    }
}
