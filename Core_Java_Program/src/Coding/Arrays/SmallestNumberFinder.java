package Coding.Arrays;

public class SmallestNumberFinder {

  public static void main(String[] args) {
    int[] numbers = { 3, 5, 7, 2, 8 };
    int smallest = findSmallestNumber(numbers);
    System.out.println(smallest); // Output: 2
  }

  public static int findSmallestNumber(int[] array) {
    // // Assume the first element as the smallest
    int smallest = array[0]; // 3

    // Iterate through the array to find the smallest number
    for (int i = 1; i < array.length; i++) {
      // Update the smallest number if a smaller number is found
      if (smallest > array[i]) { // 3>5, 3>7, 3>2, 2>8
        smallest = array[i];
      }
    }
    return smallest;
  }
}
