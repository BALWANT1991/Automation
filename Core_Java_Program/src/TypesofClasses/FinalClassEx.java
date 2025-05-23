package TypesofClasses;

// Final class
final class FinalClass {

  void method() {
    System.out.println("Method in final class");
  }
}

// Subclass attempting to extend a final class
// (will result in a compilation error)
class Subclass extends FinalClass {}

