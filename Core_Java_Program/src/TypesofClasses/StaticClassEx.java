package TypesofClasses;

// Static class example
public class StaticClassEx {

  // Static nested class to contain utility methods
  public static class Calculator {

    // Static method to calculate the square of a number
    public static int square(int num) {
      return num * num;
    }

    // Static method to calculate the cube of a number
    public static int cube(int num) {
      return num * num * num;
    }
  }

  public static void main(String[] args) {
    // Calling static methods of the nested class
    // directly using the class name
    int squareResult = Calculator.square(5);
    System.out.println(squareResult); // Output: 25

    int cubeResult = Calculator.cube(3);
    System.out.println(cubeResult); // Output: 27
  }
}
