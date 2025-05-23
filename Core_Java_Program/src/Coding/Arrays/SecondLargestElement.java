package Coding.Arrays;

public class SecondLargestElement {

  public static void main(String[] args) {
    int[] array = { 10, 7, 23, 45, 30 };

    int secondLargest = findSecondLargest(array);
    System.out.println(secondLargest); // Output: 23
  }

  public static int findSecondLargest(int[] array) {
    int largest = Integer.MIN_VALUE; // OR 0
    int secondLargest = Integer.MIN_VALUE; // OR 0

    for (int i = 0; i < array.length; i++) {
      int num = array[i];
      if (largest < num) { 
        secondLargest = largest;
        largest = num;
      } 
    }
    return secondLargest;
  }
}
