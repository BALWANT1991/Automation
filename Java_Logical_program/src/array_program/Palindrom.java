 package array_program;

public class Palindrom {

	public static void main(String[] args) {
     
		String s1 ="madam";
		String rev="" ;
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(rev)) {
			System.out.println("Panlindrom:"+rev); 
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
