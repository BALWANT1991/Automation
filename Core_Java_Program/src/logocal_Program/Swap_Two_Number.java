package logocal_Program;

import java.util.Scanner;

public class Swap_Two_Number {

	public static void main(String[] args) {
//     int x=100;
//     int y=120;
//     int z;
    
        int x,y,z;
		Scanner sc=new Scanner(System.in);	
		 x = sc.nextInt();
		  y = sc.nextInt();
		
		System.out.println("Before Swapping \n x= "+x+ "\n y="+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping \n x="+x+"\ny="+y);
		
	}

}
