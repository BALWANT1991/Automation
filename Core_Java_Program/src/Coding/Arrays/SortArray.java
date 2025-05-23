package Coding.Arrays;

import java.util.Arrays;

public class SortArray {

  public static void main(String[] args) {
    int[] numbers = { 5, 2, 9, 1 }; // Input
    // Arrays.sort(numbers); // Sort the array in ascending order
    bubbleSortArray(numbers);
    System.out.println(Arrays.toString(numbers));
    // Output: [1, 2, 5, 9]
  }

  public static void bubbleSortArray(int[] array) {
    int n = array.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) { // outer for loop
      swapped = false;
      for (int j = 0; j < n - 1 - i; j++) { // inner for loop
        if (array[j] > array[j + 1]) {
          // Swap array[j] and array[j + 1]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      // If no two elements were swapped by inner loop, then break
      if (!swapped) break;
    }
  }
}
