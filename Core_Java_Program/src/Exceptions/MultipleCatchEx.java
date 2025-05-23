package Exceptions;

public class MultipleCatchEx {

  public static void main(String[] args) {
    try {
      int[] numbers = { 1, 2, 3 };
      System.out.println(numbers[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException e) {
      System.err.println("1 2 3");
    }
  }
}
// Output: Index 3 out of bounds for length 3
