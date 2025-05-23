package Coding.Strings;

// Counts the number of characters in a string
public class CharacterCounter {

  public static void main(String[] args) {
    // Set the input
    String str = "Interview Happy"; // 15

    // Set result received by the function
    int characterCount = countCharacters(str);

    // Print result: // Output: 15
    System.out.println(characterCount);
  }

  // Function
  public static int countCharacters(String input) {
    // Edge case
    if (input == null) {
      return 0; // Handle null input by returning 0
    }

    // Logic
    return input.length();
  }
}
