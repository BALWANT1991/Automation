package Coding.Strings;

public class ReverseString {

  public static void main(String[] args) {
    String inputStr = "Interview Happy"; // Set input
    String reversedString = reverseString(inputStr); // Set result
    System.out.println(reversedString); // Print result
  }

  public static String reverseString(String input) { // Function
    if (input == null) { // Edge case
      return null;
    }

    // Logic
    StringBuilder reversed = new StringBuilder(); // Empty string

    // Iterate all elements in reverse order
    for (int i = input.length() - 1; i >= 0; i--) {
      reversed.append(input.charAt(i));
    }
    return reversed.toString();
  }
} // Output: yppaH weivretnI
