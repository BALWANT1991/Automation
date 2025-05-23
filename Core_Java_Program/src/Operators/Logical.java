package Operators;

public class Logical {

  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;

    // Logical AND
    boolean andResult1 = x && y;
    System.out.println(andResult1); // false

    boolean andResult2 = x && ("abc" == "abc");
    System.out.println(andResult2); // true

    // logical OR
    boolean orResult1 = x || y;
    System.out.println(orResult1); // true

    boolean orResult2 = ("abc" != "abc") || y;
    System.out.println(orResult2); // false
  }
}
