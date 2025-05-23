package String;

public class StringComparisonEx {

  public static void main(String[] args) {
    String str1 = "Happy";
    String str2 = new String("Happy");

    // Using == to compare string references
    // different objects in memory
    System.out.println(str1 == str2); // false

    // Using equals() to compare string contents
    System.out.println(str1.equals(str2)); // true
  }
}
