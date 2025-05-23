package Inheritance;

// Permanent Employee class (child/ derived/ sub)
public class PermEmployee extends Employee {

  public void doFun() {
    System.out.println("having fun");
  }

  public static void main(String[] args) {
    // Create an Employee object
    PermEmployee permEmp = new PermEmployee();

    permEmp.doFun(); // Call sub class own method

    // superclass methods automatically available
    // for subclass object
    permEmp.setExp(5);

    double salary = permEmp.calculateSalary();
    System.out.println(salary);
    //Output: having fun    250000
  }
}
