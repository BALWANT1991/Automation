package TypesofClasses;

public class FinalMethodEx {
  // Final method
  final void finalMethod() {
    System.out.println("Final method");
  }
}

class SubMainclass extends FinalMethodEx {
  // Overriding final method will result 
  // in a compilation error
  @Override
  void finalMethod() {
    System.out.println("Final method");
  }
}

