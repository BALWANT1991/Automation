package javaExample;

import java.util.Scanner;

public class BreakUse {

	public static void main(String[] args) {
	
		double sum =0;
		Scanner sc = new Scanner(System.in);
		double number =sc.nextDouble();
		
		while(true) {
			System.out.println("Enter the Number :");
			
			if(number<sum) {
				break;
			}
			
			sum = sum+number;
		}
		System.out.println("Addition of number is:"+sum);
		

	}

}
