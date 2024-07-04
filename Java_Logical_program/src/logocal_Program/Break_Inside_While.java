package logocal_Program;

import java.util.Scanner;

public class Break_Inside_While {

	public static void main(String[] args) {
    double number,sum=0.0;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter a number:");
		number=sc.nextDouble();
		if(number<0.0) {
			break;
		}
		sum+=number;
	}
	System.out.println("sum of:"+sum);
	}

}
