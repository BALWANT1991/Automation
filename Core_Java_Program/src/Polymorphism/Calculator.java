package Polymorphism;

// Q. What is Method Overloading? 
// Q. Why we call method overloading as a type of compile-time or early binding?
public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();

    System.out.println(calc.add(5, 10)); // 15
    System.out.println(calc.add(3.5, 2.5)); // 6.0
    System.out.println(calc.add(2, 4, 6, 8)); // 12
  }
}
