package string_program;

public class Sample3 {
	public static void main(String[] args) {
		
	String str="i am the best hero in self";
	 String[] word = str.split(" ");
     System.out.println(word.length);
//Type1
  System.out.println("<------------------Type 1-------------------->");
System.out.println(word[0]+":"+word[0].length()); 
System.out.println(word[1]+":"+word[1].length());
System.out.println(word[2]+":"+word[2].length());
System.out.println(word[3]+":"+word[3].length());
System.out.println(word[4]+":"+word[4].length());
System.out.println(word[5]+":"+word[5].length());
System.out.println(word[6]+":"+word[6].length());
	
System.out.println("<-----------------Type 2-------------------->");
//Type2

for(int i=0;i<word.length;i++) {
System.out.println(word[i]+":"+word[i].length());	
}
	}
}
