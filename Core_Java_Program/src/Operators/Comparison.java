package Operators;

public class Comparison {

  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    
    // Comparison operators
    boolean isEqual = x == y; 
    System.out.println(isEqual); // false

    boolean isNotEqual = x != y; 
    System.out.println(isNotEqual); // true

    boolean isGreater = x > y; 
    System.out.println(isGreater); // true

    boolean isLess = x < y; 
    System.out.println(isLess); // false

    boolean isGreaterOrEqual = x >= y; 
    System.out.println(isGreaterOrEqual); // true

    boolean isLessOrEqual = x <= y; 
    System.out.println(isLessOrEqual); // false    
  }
}
