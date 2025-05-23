package Coding.Numbers;

// Greatest Common Divisor
public class GCD {

  public static void main(String[] args) {
    int num1 = 30, num2 = 18; // Multiple inputs
    int result = findGCD(num1, num2); //Result
    System.out.println(result); // Print 6
  }

  public static int findGCD(int num1, int num2) {

    for (int i = num2; i >= 1; i--) {
      if (num2 % i == 0 && num1 % i == 0) {
        return i; // Return the GCD
      }
    }
    return 1; 
  }
}
