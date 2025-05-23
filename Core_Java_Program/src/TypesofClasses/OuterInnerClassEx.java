package TypesofClasses;

// Outer Class
public class OuterInnerClassEx {

  private int outerField = 10;

  // Member inner class
  public class InnerClass {

    public void displayOuterField() {
      System.out.println(outerField);
    }
  }

  public static void main(String[] args) {
    // Create an instance of OuterInnerClassEx
    OuterInnerClassEx outer = new OuterInnerClassEx();

    // Create an instance of InnerClass
    // using the outer instance
    InnerClass inner = outer.new InnerClass();

    // Invoke method of InnerClass to display outer field
    inner.displayOuterField(); // Output: 10
  }
}
