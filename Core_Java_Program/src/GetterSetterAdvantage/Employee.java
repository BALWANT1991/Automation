package GetterSetterAdvantage;

public class Employee {
  private int exp; // Field

  public int getExp() { // Getter method
    return exp * 2;
  }

  public void setExp(int exp) { // Setter method
    if (exp < 0) { // Validate experience
      System.out.println("Incorrect Experience");
      return;
    }
    this.exp = exp;
  }

  public static void main(String[] args) {
    Employee emp = new Employee();

    //emp.exp = 5; // Not recommended
    emp.setExp(5); // Set exp using setter method

    System.out.println(emp.getExp()); // Output: 10
  }
}
