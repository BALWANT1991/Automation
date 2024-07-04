//3. WAP to count the number of occurrence of a single character in a String:

package string_program;
public class String7 {
	public static void main(String[] args) {			
				String s = "abcdefabcdef";
				int count = 0;
				
				for (int i=0; i<s.length(); i++)
				{
				if (s.charAt(i)=='a')// to count the occurrance of character 'a' in the string
				{
				count = count +1;
					}}
				System.out.println("The character a is available for "+count+ " times");
				}
	}
