//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Corporate Payroll System ===");

        // 1. Regular Employee (Base Salary Only)
        Employee emp = new Employee(1, "Ahmed", 4000.0);
        System.out.println(emp.name + " Salary: $" + emp.calculateSalary()); // Output: 4000.0

        // 2. Developer (Base Salary + 10 Overtime Hours * $20)
        Developer dev = new Developer(2, "Omar", 6000.0, 10);
        System.out.println(dev.name + " Salary: $" + dev.calculateSalary()); // Output: 6200.0

        // 3. Lead Developer (Base Salary + 10 Overtime Hours + $500 Bonus)
        LeadDeveloper lead = new LeadDeveloper(3, "Sarah", 8000.0, 10);
        System.out.println(lead.name + " Salary: $" + lead.calculateSalary()); // Output: 8700.0

        // Testing the private ID access via method
        lead.printEmployeeDetails();
    }
}