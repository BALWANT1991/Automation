package Generics;

// Without Generics
public class Compare {

  public boolean areEqual(int value1, int value2) {
    return value1 == value2;
  }

  // Overloaded method to handle string type
  public boolean areEqual(String value1, String value2) {
    return value1 == value2;
  }

  public static void main(String[] args) {
    Compare comp = new Compare();

    // Comparing integers
    boolean intResult = comp.areEqual(10, 10);
    System.out.println(intResult); // Output: true

    // Comparing strings will not work
    // because areEqual method is not type safe
    boolean strResult = comp.areEqual("ab", "ab");
    System.out.println(strResult); // Output: true
  }
}
