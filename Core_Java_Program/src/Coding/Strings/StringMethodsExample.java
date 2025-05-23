package Coding.Strings;

public class StringMethodsExample {

  public static void main(String[] args) {
    // Example string
    String str = "   Interview Happy   ";

    // Returns the char value at the specified index
    char ch = str.charAt(7);
    System.out.println(ch); // Output: r

    // Removes leading and trailing whitespaces
    String trimmedStr = str.trim();
    System.out.println(trimmedStr);
    // Output: Interview Happy

    // Replaces occurrences of the specified target
    // sequence with the specified replacement sequence
    String replacedStr = str.replace("Happy", "Crack");
    System.out.println(replacedStr);
    // Output:    Interview Crack

    // Splits the string into an array of substrings 
    String[] parts = str.trim().split(" ");

    for (String part : parts) {
      System.out.println(part.trim()); 
      // Output: Interview Happy
    }

    // Converts the string to a character array
    char[] charArray = str.toCharArray();
    for (char c : charArray) {
      System.out.print(c); // Output:     Interview Happy
    }
  }
}


