package Coding.Strings;

import java.util.Arrays;

public class AnagramChecker {

  public static void main(String[] args) {
    String s1 = "listen"; // Input 1
    String s2 = "silent"; // Input 2
    
    System.out.println(areAnagrams(s1, s2)); // Output: true
  }

  public static boolean areAnagrams(String str1, String str2) {
    // Convert strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1); // eilnst
    Arrays.sort(charArray2); // eilnst

    // Compare sorted character arrays
    return Arrays.equals(charArray1, charArray2);
  }
}
