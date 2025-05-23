package Generics;

public class WithoutGenericsEx {

  public static void main(String[] args) {
    // Without generics (using raw Object type)
    Object value1 = "Hello"; // value1 is of type Object

    // Attempting to retrieve and cast values without type safety
    Integer intValue = (Integer) value1; // ClassCastException at runtime

    System.out.println(intValue);
  }
}
