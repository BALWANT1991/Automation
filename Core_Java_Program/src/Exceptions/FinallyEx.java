package Exceptions;

public class FinallyEx {

  public static void main(String[] args) {
    try {
      // Code that might throw an exception
      int[] numbers = { 1, 2, 3 };

      System.out.println(numbers[3]);

      System.out.println("End");
    } catch (Exception e) {
      // Handling specific exception
      System.err.println("Error " + e.getMessage());
      // Output: Index 3 out of bounds for length 3
    } finally {
      System.out.println("Finally block run");
      // Output: Finally block run
    }
  }
}
