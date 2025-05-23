package Coding.Arrays;

// Find the length of the array
public class ArrayLength {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 }; // Input
    int length = arrayLength(numbers);
    System.out.println(length); // Output: 5
  }

  public static int arrayLength(int[] array) {
    int length = array.length;
    return length;
  }
}
