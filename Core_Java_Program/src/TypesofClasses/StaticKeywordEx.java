package TypesofClasses;

public class StaticKeywordEx {

  // Static variable
  public static int count = 0;

  // Static methods
  public static int square(int num) {
    return num * num;
  }

  public static void main(String[] args) {
    System.out.println(StaticKeywordEx.count);
    // Output: 0

    int result = StaticKeywordEx.square(5);
    System.out.println(result);
    // Output: 25
  }
}
