package string_program;

public class String19 {
public static void main(String[] args) {
		
		String s = "as1d5ds78lk9jf";
		String ss = "";
		int sum = 0;
		for(int i=0;i<s.length(); i++ )
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
			ss = ss+c;
			int value = Integer.parseInt(ss);
			
			sum = sum+value;
			
			ss="";
			
			}
			
		}
		
		System.out.println(sum);//30
		
		
		
		
	}
		
		
		
	}


