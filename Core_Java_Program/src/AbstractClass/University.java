package AbstractClass;

abstract class University {

  // Concrete (non-abstract) method
  void courses() {
    System.out.println("P, C, M");
  }

  // Abstract method: at-least 1 method
  abstract void sports();

  public static void main(String[] args) {
    // Error: Object creation of
    // abstract class not possible
    University university = new University();
  }
}
