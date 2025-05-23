package Exceptions.Throw;

public class Employee {

  public void validateAge(int age) { // called method
    if (age < 0) {
      throw new IllegalArgumentException("Age cant be -ve");
    }
    System.out.println("Age is valid: " + age);
  }

  public static void main(String[] args) { // calling method
    Employee employee = new Employee();

    try {
      employee.validateAge(-5); // called method
    } catch (IllegalArgumentException e) {
      System.err.println("Error main: " + e.getMessage());
    }
  }
}
