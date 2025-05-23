package Overriding;

public class TemporaryEmp extends Employee {

  @Override //annotation used to override parent class method
  public void calculateSalary() {
    System.out.println(75000);
  }
}
