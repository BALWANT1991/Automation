public class MathUtils {

  public int add(int a, int b) {
    return a + b;
  }

  public static int substract(int a, int b) {
    return a - b;
  }

  public static void main(String[] args) {
    
    MathUtils mathUtils = new MathUtils();
    // use class instance to call non static methods
    mathUtils.add(50, 10);

    // Directly call static methods by class name
    MathUtils.substract(40, 10); 
  }
}
