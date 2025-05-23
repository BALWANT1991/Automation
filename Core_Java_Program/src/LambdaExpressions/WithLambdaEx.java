package LambdaExpressions;

// With Lambda Expression Example

interface MyFunction1 { // Functional interface
  void sayHello(); // Abstract method
}

public class WithLambdaEx {

  public static void main(String[] args) {
    // Creating an instance of the functional
    // interface using a lambda expression
    MyFunction1 myFunction = () -> {
      System.out.println("Interview Happy!");
    };

    myFunction.sayHello();
    // Output: Interview Happy!
  }
}
