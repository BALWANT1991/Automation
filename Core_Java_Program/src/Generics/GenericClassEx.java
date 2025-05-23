package Generics;

public class GenericClassEx<T> {

  public boolean areEqual(T value1, T value2) {
    return value1 == value2;
  }

  public boolean notEqual(T value1, T value2) {
    return value1 != value2;
  }

  public static void main(String[] args) {

    GenericClassEx<Integer> intComp = new GenericClassEx<>();
    
    boolean intResult = intComp.areEqual(10, 10);
    System.out.println(intResult); // Output: true

    GenericClassEx<String> strComp = new GenericClassEx<>();
    boolean strResult = strComp.areEqual("ab", "ab");
    System.out.println(strResult); // Output: true

    boolean strNotEqualResult = strComp.notEqual("ab", "xy");
    System.out.println(strNotEqualResult); // Output: true
  }
}
