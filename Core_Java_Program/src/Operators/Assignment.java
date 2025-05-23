package Operators;

public class Assignment {

  public static void main(String[] args) {
    int c = 10;

    // Assignment operators
    c += 5; // Equivalent to: c = c + 5;
    System.out.println(c); // 15

    c -= 3; // Equivalent to: c = c - 3;
    System.out.println(c); // 12

    c *= 2; // Equivalent to: c = c * 2;
    System.out.println(c); // 24

    c /= 4; // Equivalent to: c = c / 4;
    System.out.println(c); // 6

    c %= 2; // Equivalent to: c = c % 2;
    System.out.println(c); // 0
  }

}
