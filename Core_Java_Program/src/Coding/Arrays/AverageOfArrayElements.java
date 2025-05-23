package Coding.Arrays;

public class AverageOfArrayElements {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 }; // Input
    double average = calculateAverage(numbers);
    System.out.println(average); // Output: 3.0
  }

  public static double calculateAverage(int[] array) {

    int sum = 0;
    
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i]; // Add each element to the sum
    }
    return (double) sum / array.length;
  }
}
