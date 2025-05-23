package LambdaExpressions;

// Function Interface
public interface Calculator {
  int operate(int a, int b); // Single abstract method

  default void display() {
    System.out.println("Calculator interface");
  }

  static void info() {
    System.out.println("Perform arithmetic operations");
  }
}
