package practice_Java_Program;

public class Demo1 {

	public static void main(String[] args) {
  String a="balwantsingh09876#$%5";
  System.out.println(a.length());
  System.out.println(a.charAt(3));
  System.out.println(a.toLowerCase());
  System.out.println(a.toUpperCase());
    String b=a.replace("0", "x");  
	System.out.println(b);
	System.out.println(b.length());
	String c=a.replaceAll("[0-9]", "");
	System.out.println(c);
	String d=a.replaceAll("[a-z A-Z ]", "");
	System.out.println(d);
	 String e=a.replaceAll("[a-z A-Z 0-9]", "");
	System.out.println(e);
	for(int i=a.length()-1;i>=0;i--) {
		String rev="";
		rev=rev+a.charAt(i);
		System.out.println(rev);
	}
	}

}
