//Write a program to reverse a String :
package string_program;

public class Sample5 {
	public static void main(String[] args) {
		String s = "deva";
		String rev="";
		
		for (int i=(s.length()-1); i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The reversed String is :"+rev);
	}
}
