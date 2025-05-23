package Coding.Numbers;

public class Factorial {

  public static void main(String[] args) {
    int number = 5; // Input
    long factorial = calculateFactorial(number); // Result
    System.out.println(factorial); // output: 120
  }

  public static long calculateFactorial(int num) {
    if (num == 0) { // Edge case
      return 1;
    }
    long result = 1; // Set initial value
    for (int i = 1; i <= num; i++) {
      result = result * i;
    }
    return result;
  }
}
