package string_program;

public class Sample4 {
public static void main(String[] args) {
String str="as df fghj dfghj sdfghxcs wertyujhgfds asdfgfdsa";	
          String[] word = str.split(" ");
          for(int i=0;i<=word.length-1;i++) {
        	  System.out.println(word[i]+":"+word[i].length());
        	  String word1 = word[i];
          System.out.println(word1.substring(0, 1).toUpperCase()+word1.substring(1, word1.length()));
          }
}
}
