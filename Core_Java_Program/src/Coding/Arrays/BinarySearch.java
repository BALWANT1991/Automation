package Coding.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    int[] numbers = { 2, 30, 4, 10, 40 };
    int target = 10;
    int result = binarySearch(numbers, target);

    if (result == -1) {
      System.out.println("Element not present in the array");
    } else {
      System.out.println("Element found at index " + result);
    } // Element found at index 3
  }

  // Binary search function
  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1; // 4

    while (left <= right) { // 0 <= 4, 3 <= 4
      int mid = left + (right - left) / 2; // 2, 3

      // Check if target is present at mid
      if (array[mid] == target) { // 4 == 10, 10 == 10
        return mid; // Target found at index mid
      }

      // If target is greater, ignore the left half
      if (array[mid] < target) { // 4 < 10
        left = mid + 1; // 3
      }
      // If target is smaller, ignore the right half
      else {
        right = mid - 1;
      }
    }

    // Target not found in array
    return -1;
  }
}
