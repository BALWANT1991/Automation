package LambdaExpressions;

// Without Lambda Expression Example
interface MyFunction { // Functional interface
  void sayHello(); // Abstract method
}

class MyFunctionImpl implements MyFunction {

  public void sayHello() {
    System.out.println("Interview Happy!");
  }
}

public class WithoutLambdaEx {

  public static void main(String[] args) {
    MyFunctionImpl myFunction = new MyFunctionImpl();

    myFunction.sayHello(); 
    // Output: Interview Happy!
  }
}
