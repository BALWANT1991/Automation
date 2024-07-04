package string_program;

import java.util.LinkedHashSet;

public class String11 {
	public static void main(String[] args) {
	      String s = "abcdefabcdef";
	      LinkedHashSet<Character>  hs = new LinkedHashSet<Character>();
	      for(int i=0; i<s.length(); i++)
	      {
	      if(!(hs.contains(s.charAt(i))))
	      {
	      hs.add(s.charAt(i));
	      }}
	      System.out.println(hs);				
	      }

}
