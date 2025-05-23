package TypesofClasses;

// Static Method Example
public class StaticMethodEx {

  // Public static method to calculate 
  // the square of a number
  public static int square(int num) {
    return num * num;
  }

  public static void main(String[] args) {
    // Calling the static method directly 
    // using the class name
    int result = StaticMethodEx.square(5);
    System.out.println(result); // Output:  25
  }
}
