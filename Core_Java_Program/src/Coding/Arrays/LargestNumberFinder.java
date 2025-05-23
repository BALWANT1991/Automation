package Coding.Arrays;

public class LargestNumberFinder {

  public static void main(String[] args) {
    int[] numbers = { 10, 7, 23, 45, 8 }; // Input
    int largestNumber = findLargestNumber(numbers);
    System.out.println(largestNumber); // Output: 45
  }

  public static int findLargestNumber(int[] array) {
    // Assume the first element as the largest number
    int largest = array[0];

    // Iterate through the array to find the largest number
    for (int i = 1; i < array.length; i++) {
      if (largest < array[i]) {
        // Update the largest number if a larger number is found
        largest = array[i];
      }
    }
    return largest;
  }
}
