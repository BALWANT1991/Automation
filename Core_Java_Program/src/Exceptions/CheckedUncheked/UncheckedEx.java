package Exceptions.CheckedUncheked;

public class UncheckedEx {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    // Unchecked Error: ArithmeticException
    // Identified at run time
    int result = a / b;
    System.out.println("Result: " + result);
  }
}


