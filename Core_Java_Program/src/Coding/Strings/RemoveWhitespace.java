package Coding.Strings;

public class RemoveWhitespace {

  public static void main(String[] args) {
    String str = "  Interview   Happy  !  ";
    String result = removeWhitespace(str);
    System.out.println(result);
  }

  public static String removeWhitespace(String str) {
    return str.replaceAll("\\s", "");
  }
}
