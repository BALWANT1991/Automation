package string_program;

public class Sample {
	public static void main(String[] args) {
		
	
	String b="Balwantsingh chauhan";
	
	System.out.println(b);
	System.out.println(b.length());
	System.out.println(b.toUpperCase());
	System.out.println(b.toLowerCase());
	System.out.println(b.charAt(3));
    String x = b.replace(" ", "lovely");	
    System.out.println(x);
    System.out.println(x.length());
    
    for(int i=x.length()-1;i>=0;i--) {
    	System.out.print(x.charAt(i));
    }
	}
}
 