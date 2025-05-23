package ThisKeyword;

public class Employee {

  private int exp;

  public void setExp(int exp) {
    
    this.exp = exp; // this.name is class field
  }

  public static void main(String[] args) {
    Employee emp = new Employee();

    //emp.exp = 10; // not recommended
    emp.setExp(10);
    System.out.println(emp.exp);
  }
}
