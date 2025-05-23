package String;

public class StringPoolEx {

  public static void main(String[] args) {
    String s1 = "Happy";
    String s2 = "Happy";

    // s1 and s2 refer to the same string
    // literal in the pool
    System.out.println(s1 == s2); // true

    String s3 = new String("Happy");
    // s3 refers to a new String object
    // in the heap, not in the pool
    System.out.println(s1 == s3); // false
  }
}
