package Coding.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayMethodsExample2 {

  public static void main(String[] args) {
    // Initializing an array
    int[] array = { 5, 3, 1, 4, 2 };
    // Copy a specified range of the array into a new array
    int[] subArray = Arrays.copyOfRange(array, 1, 4);
    System.out.println(Arrays.toString(subArray));
    // Output: [3, 1, 4]

    // Check if two arrays are equal
    int[] array1 = { 1, 2, 3 };
    int[] array2 = { 1, 2, 3 };
    boolean isEqual = Arrays.equals(array1, array2);
    System.out.println(isEqual); // Output: true

    // Perform binary search for a key in the array
    Arrays.sort(array); 
    int index = Arrays.binarySearch(array, 3);
    System.out.println(index); // Output: 2

    // Convert the array to a fixed-size list
    Integer[] integerArray = { 1, 2, 3 };
    List<Integer> list = Arrays.asList(integerArray);
    System.out.println(list); // Output: [1, 2, 3]

    // Create a stream from the array
    IntStream stream = Arrays.stream(array);
    int sum = stream.sum();
    System.out.println(sum); // Output: 15

    // Convert nested arrays to a string representation
    int[][] nestedArray = { { 1, 2, 3 }, { 4, 5, 6 } };
    String nestedArrayStr = Arrays.deepToString(nestedArray);
    System.out.println(nestedArrayStr); 
    // Output: [[1, 2, 3], [4, 5, 6]]
  }
}
