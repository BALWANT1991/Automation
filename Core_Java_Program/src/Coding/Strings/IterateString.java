package Coding.Strings;

public class IterateString {

  public static void main(String[] args) {
    String str = "Interview Happy";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      System.out.print(ch + " ");
    }
  }
}
