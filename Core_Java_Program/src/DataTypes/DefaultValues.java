package DataTypes;

public class DefaultValues {

  // Instance variables
  int intVar;
  double doubleVar;
  char charVar;
  boolean boolVar;
  String strVar;

  public void printDefaultValues() {
    System.out.println(intVar); // Output: 0
    System.out.println(doubleVar); // Output: 0.0
    System.out.println(charVar); // Output:
    System.out.println(boolVar); // Output: false
    System.out.println(strVar); // Output: null
  }

  public static void main(String[] args) {
    DefaultValues dv = new DefaultValues();
    dv.printDefaultValues();
  }
}
