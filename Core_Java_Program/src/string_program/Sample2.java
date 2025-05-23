package string_program;

public class Sample2 {
 public static void main(String[] args) {
	String str = "fghj26fg$%hfghj345678fnm";
	System.out.println(str);
	String alphabets = str.replaceAll("[0-9 $%]", "");
System.out.println(alphabets);
	System.out.println("total alphabets:"+alphabets.length());

   String numbers = str.replaceAll("[a=z a-z %$@]","");	
	System.out.println(numbers);
    System.out.println("total num:"+numbers.length());
    
 }
	
}
