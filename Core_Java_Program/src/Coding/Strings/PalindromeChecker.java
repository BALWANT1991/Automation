package Coding.Strings;

public class PalindromeChecker {

  public static void main(String[] args) {
    String testString = "abba"; // Set input

    boolean result = isPalindrome(testString); // Set result

    System.out.println(result); // Print result (Output: true)
  }

  public static boolean isPalindrome(String input) {
    if (input == null) { // Edge case
      return false;
    }

    StringBuilder reversed = new StringBuilder(); // Empty string
    for (int i = input.length() - 1; i >= 0; i--) { // Reverse the string
      reversed.append(input.charAt(i));
    }

    // Compare strings and return true or false
    if (input.equals(reversed.toString())) {
      return true;
    } else {
      return false;
    }
  }
}
