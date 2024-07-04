package logocal_Program;

public class Swap_Two_Num_Without_Third_Variable {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		System.out.println("Before swapping \n x="+x+"\n y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping \n x="+x+"\n y="+y);
	}
}
