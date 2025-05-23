package Generics;

// Bounded type parameter example
public class BoundedTypeEx<T extends Number> {

  public boolean areEqual(T value1, T value2) {
    return value1 == value2;
  }

  public static void main(String[] args) {
    
    BoundedTypeEx<Integer> intCompare = new BoundedTypeEx<>();
    System.out.println(intCompare.areEqual(10, 10));

    // Compile-time error: String does not extend Number
    BoundedTypeEx<String> strCompare = new BoundedTypeEx<>();
    System.out.println(strCompare.areEqual("abc", "abc"));
  }
}

