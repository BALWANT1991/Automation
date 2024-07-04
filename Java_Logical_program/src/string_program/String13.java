// WAP to reverse the complete sentence for example String s = “This is String” then the expected output should be Reverse string = “String is This”

package string_program;
public class String13 {
	
			 public static void main(String[] args) {
			 		String s = "This is String";
			 		String rev="";
			 		
			 		String[] Splitvalue = s.split(" ");
			 		
			 		int size = Splitvalue.length-1;
			 		
			 		for(int i =size; i>=0; i--)
			 		{
			 			System.out.print(Splitvalue[i]+" ");
			 		}
			 	}}
