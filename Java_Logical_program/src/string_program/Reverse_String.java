package string_program;

public class Reverse_String {
	public static void main(String[] args) {

		String b = "Balwantsingh chauhan";

		System.out.println(b);
		System.out.println(b.length());
		
		String x = b.replace(" ", "");
		System.out.println("total alphabet:" + x);
		System.out.println("total alphabet:" + x.length());
		
		//reverse String
		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.println(x.charAt(i));
		}
	}
}
