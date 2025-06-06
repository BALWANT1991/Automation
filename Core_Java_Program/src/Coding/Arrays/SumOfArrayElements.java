package Coding.Arrays;

public class SumOfArrayElements {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 }; // Input
    int sum = calculateSum(numbers); 
    System.out.println(sum); // Output: 15
  }

  public static int calculateSum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i]; // Add each element to the sum
    }
    return sum;
  }
}
