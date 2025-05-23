package Generics;

// With Generics
public class GenericMethodEx {

  // Generic method to compare two values of type T
  public <T> boolean areEqual(T value1, T value2) {
    return value1 == value2;
  }

  public static void main(String[] args) {
    GenericMethodEx comp = new GenericMethodEx();

    // Comparing integers using generics
    boolean intResult = comp.areEqual(10, 10);
    System.out.println(intResult); // Output: true

    // Comparing strings using generics
    boolean strResult = comp.areEqual("ab", "ab");
    System.out.println(strResult); // Output: true
  }
}
