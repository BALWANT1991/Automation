package Coding.Numbers;

public class SwapNumbers {

  public static void main(String[] args) {
    int a = 5;
    int b = 10;

    // Swap using a temporary variable
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a + ", b = " + b);
  } // Output: a = 10, b = 5
}
