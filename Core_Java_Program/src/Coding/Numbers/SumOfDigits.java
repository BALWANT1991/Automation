package Coding.Numbers;

public class SumOfDigits {

  public static void main(String[] args) {
    int number = 1234;
    int sum = sumOfDigits(number);
    System.out.println(sum); // Output: 10
  }

  public static int sumOfDigits(int num) {
    int sum = 0;

    while (num != 0) {
      int reminder = num % 10; // 4, 3, 2, 1
      sum = sum + reminder; // 4, 7, 9, 10
      num = num / 10; // 123, 12, 1
    }
    return sum;
  }
}
