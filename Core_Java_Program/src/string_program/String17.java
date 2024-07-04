//WAP to add all the number individually from the String for example if the string is “ab5ds51s2” then output should be 5+5+1+2 = 13

package string_program;
public class String17 {

 public static void main(String[] args) {
		String s = "ab5ds51s2";
		int digit = 0;
		String numericstring = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
			numericstring= 	s.substring(i, i+1);
			
			digit = digit+ Integer.parseInt(numericstring);
			
			}
		}
		System.out.println("The numeric string is :" + digit);	
	}


}
