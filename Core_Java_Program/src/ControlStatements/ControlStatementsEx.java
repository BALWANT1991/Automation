package ControlStatements;

public class ControlStatementsEx {

  public static void main() {
    int number = 0;

    if (number > 0) {
      System.out.println("positive");
    } else if (number < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero"); // zero
    }

    for (int i = 1; i <= 5; i++) {
      System.out.println(i); // 1 2 3
      if (i == 3) {
        break;
      }
    }

    System.out.println("End"); // End
  }
}
