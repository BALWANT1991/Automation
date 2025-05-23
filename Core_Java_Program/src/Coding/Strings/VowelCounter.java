package Coding.Strings;

public class VowelCounter {

  public static void main(String[] args) {
    String inputString = "Interview Happy"; // Input

    int numVowels = countVowels(inputString); // Result

    System.out.println(numVowels); // Output: 5
  }

  public static int countVowels(String str) {
    String vowels = "aeiouAEIOU"; 

    // Initialize a variable to count the number of vowels
    int vowelCount = 0;

    // Iterate through each character of the string
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // Check if the character is a vowel
      if (vowels.indexOf(ch) != -1) {
        // Increment the vowel count if the character is a vowel
        vowelCount++;
      }
    }
    return vowelCount;
  }
}
