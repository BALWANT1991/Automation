package Constructors;

public class Employee {

  private String name; // Field

  // Parameterized constructor
  public Employee(String name) {
    this.name = name; // field initialization
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    
    Employee emp = new Employee("Happy"); 

    System.out.println(emp.getName());
  }
}
