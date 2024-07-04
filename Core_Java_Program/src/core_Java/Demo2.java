package core_Java;

public class Demo2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//nested loops works -
		int k = 1;
		for (int i = 0; i < 5; i++) // (outer for loop) this block will loop for 4 times
		{
//System.out.println( "outer loop started");
			for (int j=1; j<= 5-i; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
System.out.println( "");
		}
	}

}