package practice_Java_Program;

public class Demo2 {

	public static void main(String[] args) {

		String s="asaldsnabafbkadnkajnd";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
			{
				count=count+1;
				System.out.println(""+count+"");
			}
			
		}
	}

}
