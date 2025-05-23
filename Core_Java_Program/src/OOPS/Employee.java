package OOPS;

// Class and object example
public class Employee {

  private int experience; // 1. Field

  public Employee() {} // 2. Constructor

  public double calculateSalary() { // 3. Method
    int salary = experience * 50000;
    return salary;
  }

  public static void main(String[] args) {
    // Create an Employee object
    Employee employee = new Employee();
    employee.experience = 5;
    double salary = employee.calculateSalary();
    System.out.println(salary);
    //Output: 250000
  }
}
