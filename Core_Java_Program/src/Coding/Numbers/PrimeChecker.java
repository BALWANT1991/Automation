package Coding.Numbers;

public class PrimeChecker {

  public static void main(String[] args) {
    int num = 17; // input

    System.out.println(isPrime(num)); // print output
  }

  public static boolean isPrime(int number) {
    // Edge case: Check if the number is less than or equal to 1
    if (number <= 1) {
      return false; // 1 and numbers <= 1 are not prime
    }

    // Check for divisibility from 2 to square root of the number
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false; // Found a divisor other than 1 and itself
      }
    }
    // If no divisors other than 1 and itself are found, it's prime
    return true;
  }
} // Output: true
