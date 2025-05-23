package Coding.Strings;

public class LongestWordFinder {

  public static void main(String[] args) {
    String testSentence = "Interviews are the best"; // input
    String longestWord = findLongestWord(testSentence); // result
    System.out.println(longestWord); // print result
  }

  // Function
  public static String findLongestWord(String sentence) {
    if (sentence == null || sentence.isEmpty()) { // edge case
      return ""; 
    }

    // Logic
    String longestWord = ""; // set the empty word
    String[] words = sentence.split(" "); // break to array of words

    for (String word : words) { // iterate all the words
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }
    return longestWord;
  }
} // Output: Interviews
