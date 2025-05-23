package ControlStatements;

public class Switch {

  public static void main() {
    int priority = 2;
    String result;

    // Switch statement
    switch (priority) {
      case 1:
        result = "High";
        break;
      case 2:
        result = "Medium";
        break;
      default:
        result = "Low";
        break;
    }
    System.out.println(result);
    // Output: Medium
  }
}
