package AbstractClass;

abstract class UniversityClass {

  // Concrete (non-abstract) method
  void courses() {
    System.out.println("P, C, M");
  }

  // Abstract method
  abstract void sports();

  public static void main(String[] args) {
    // Error: Object creation of abstract class not possible
    UniversityClass university = new UniversityClass();
  }
}


