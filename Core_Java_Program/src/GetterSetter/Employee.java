package GetterSetter;

public class Employee {

  private int exp; // Field

  public int getExp() { // Getter method
    return exp;
  }

  public void setExp(int exp) { // Setter method
    this.exp = exp;
  }

  public static void main(String[] args) {
    Employee emp = new Employee();

    //emp.exp = 5; // Not recommended
    emp.setExp(5); // Set exp using setter method

    System.out.println(emp.getExp());
    // Output: 5
  }
}
