import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee("John Doe", 55000.00, 2020, "AB123456C");

        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        employee.setName("Jane Doe");
        employee.setAnnualSalary(60000.00);
        employee.setYearStarted(2019);
        employee.setNationalInsuranceNumber("CD789012E");

        System.out.println("\nUpdated Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
        sc.close();
    }
}
