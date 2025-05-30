package Coding.Arrays;

public class CheckIfArraySorted {

  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3, 4, 5 };

    System.out.println(isSorted(array1)); // Output: true
  }

  public static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
