package employee;

public class Employee {
      int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}
