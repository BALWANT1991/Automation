package Constructors;

public class Subclass extends Superclass {

  public Subclass() {
    super(); // (optional - automatically placed)
    System.out.println("from subclass");
  }

  public static void main(String[] args) {
    // Creating an object of Subclass
    Subclass subclass = new Subclass();
  }
}
// Output: from superclass
// from subclass
