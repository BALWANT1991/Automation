package ControlStatements;

public class CompareStatemenst {

  public static void main(String[] args) {

    // Using if...else conditions
    int age = 25;
    int height = 6;

    if (age < 25 && height < 5) {
      System.out.println("Minor.");
      System.out.println("Short.");
    } else if (age >= 18 && height > 6) {
      System.out.println("Adult.");
      System.out.println("Tall.");
    } else {
      System.out.println("Average");
    }
    // Output: "Average"

    // Using the ternary operator
    boolean isUser = true;

    int user = isUser ? 10 : 20;

    System.out.println(user);

    // Output: 10

    // Using switch statements
    int day = 2;
    String dayString;

    switch (day) {
      case 1:
        dayString = "Monday";
        break;
      case 2:
        dayString = "Tuesday";
        break;   
      default:
        dayString = "Wednesday";
        break;
    }
    System.out.println(dayString); 
    // Output: Tuesday
  }
}

