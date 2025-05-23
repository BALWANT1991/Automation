package ControlStatements;

public class IfElse {

  public static void main() {
    int num = 0;

    if (num > 0) {
      System.out.println("positive");
    } else if (num < 0) {
      System.out.println("negative");
    } else if (num == 10) {
      System.out.println("ten");
    } else {
      System.out.println("zero");
    }
    // Output: zero
  }
}
