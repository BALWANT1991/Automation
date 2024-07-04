//WAP to remove the numbers from the String

package string_program;
public class String15 {
		public static void main(String[] args) {
			String s = "d5de5dd56d5dd";
			String numericstring = "";

			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					numericstring = numericstring + s.charAt(i);

				}

			}
			System.out.println("The numeric string is :" + numericstring);

		}
}
