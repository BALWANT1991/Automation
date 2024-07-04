package logocal_Program;

public class Logic1 {

	public static void main(String[] args) {

		String str="ABCD";
		int s=str.length()-1;
		for(int i=-1;i<=s;i++) {
			if(i==-1) {
				System.out.println(str.charAt(s)+"");
			}
			else {
				System.out.println(str.charAt(i)+ "");
			}
		}
	}

}
