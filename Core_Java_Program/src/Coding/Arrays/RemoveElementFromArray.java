package Coding.Arrays;

import java.util.Arrays;

public class RemoveElementFromArray {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 3, 6 }; 
    int elementToRemove = 3; // Element to be removed
    
    int[] newArray = removeElement(array, elementToRemove);

    System.out.println(Arrays.toString(newArray));
    // Output: [1, 2, 4, 5, 6]
  }

  public static int[] removeElement(int[] array, int element) {
    int count = 0;

    // Count occurrences of the element to be removed
    for (int item : array) {
      if (item == element) {
        count++;
      }
    }

    // Create a new array of the appropriate size
    int[] newArray = new int[array.length - count];
    int index = 0;

    // Copy elements except the one to be removed
    for (int item : array) {
      if (item != element) {
        newArray[index++] = item;
      }
    }

    return newArray;
  }
}
