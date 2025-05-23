package Coding.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

  public static void main(String[] args) {
    int[] inputArray = { 2, 4, 3, 2, 7, 8, 4, 7 }; // Input

    int[] newArray = removeDuplicates(inputArray); // result

    System.out.println(Arrays.toString(newArray)); //Output: [2, 4, 3, 7, 8]
  }

  public static int[] removeDuplicates(int[] array) {
    // Initialize the index to keep track of the unique elements
    int index = 0;

    int[] uniqueArray = new int[array.length];

    // Iterate over the array
    for (int i = 0; i < array.length; i++) {
      boolean isDuplicate = false;

      // Check if the current element is a duplicate
      for (int j = 0; j < i; j++) {
        if (array[i] == array[j]) {
          isDuplicate = true;
          break;
        }
      }

      // If not a duplicate, copy it to the result array
      if (!isDuplicate) {
        uniqueArray[index++] = array[i];
      }
    }

    // Create a new array with the unique elements
    return Arrays.copyOf(uniqueArray, index);
  }
}
