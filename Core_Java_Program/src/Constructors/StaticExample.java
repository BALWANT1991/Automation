package Constructors;

public class StaticExample {

  // Static variable
  static int staticVariable = 10;

  // Static method
  static void staticMethod() {
    System.out.println("Static method called.");
  }

  public static void main(String[] args) {
    // Accessing static variable directly
    System.out.println(staticVariable);

    // Accessing static method directly
    staticMethod();
  }
}
