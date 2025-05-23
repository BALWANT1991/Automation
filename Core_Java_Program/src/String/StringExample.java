package String;

public class StringExample {

  public static void main(String[] args) {
    String str1 = "Interview";
    String str2 = "Happy";

    // 1. Length of the string
    int length = str1.length();
    System.out.println(length); // Output: 9

    // 2. Concatenation - joing two strings
    String result = str1.concat(", " + str2);
    System.out.println(result); // Output: Interview, Happy

    // 3. Substring - Retrieves substring from index 5 to 9
    String substring = result.substring(5, 9);
    System.out.println(substring); // Output: view

    // 4. Index of - // Finds index of character 'H'
    int index = result.indexOf('H');
    System.out.println(index); // Output: 11

    // 5. Equality - Checks if strings are equal
    boolean isEqual = str1.equals(str2);
    System.out.println(isEqual); // Output: false
  }
}
