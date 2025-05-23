package LambdaExpressions;

// Normal Interface
public interface Shape {
  double area(); // Abstract method
  double perimeter(); // Another abstract method

  default void display() {
    System.out.println("Displaying shape");
  }
}
