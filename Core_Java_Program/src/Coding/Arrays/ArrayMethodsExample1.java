package Coding.Arrays;

import java.util.Arrays;

public class ArrayMethodsExample1 {

  public static void main(String[] args) {
    // Initializing an array
    int[] array = { 5, 3, 1, 4, 2 };

    // Convert array to a string representation
    String arrayStr = Arrays.toString(array);
    System.out.println(arrayStr);
    // Output: [5, 3, 1, 4, 2]

    // Sort the array in ascending order
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    // Output: [1, 2, 3, 4, 5]

    // Fill the array with a specific value
    Arrays.fill(array, 1);
    System.out.println(Arrays.toString(array));
    // Output: [1, 1, 1, 1, 1]

    // Reinitialize the array for further operations
    array = new int[] { 5, 3, 1, 4, 2 };

    // Copy the array to a new array of specified length
    int[] newArray = Arrays.copyOf(array, 7);
    System.out.println(Arrays.toString(newArray));
    // Output: [5, 3, 1, 4, 2, 0, 0]
    
    // Check if two arrays are equal
    int[] array1 = { 1, 2, 3 };
    int[] array2 = { 1, 2, 3 };
    boolean isEqual = Arrays.equals(array1, array2);
    System.out.println(isEqual); // Output: true
  }
}
