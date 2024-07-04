package javaExample;

import java.util.Scanner;

public class BubbleShort2 {

	public static void main(String[] args) {
		
		int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many Number bYou Want :");
	int num =sc.nextInt();
		for(int i =1;i<=num;i++) {
			System.out.print("Enter the Number "+i+" :");
			int xx =sc.nextInt();
			
			sum = sum+xx;
			
		}
		System.out.println("this is additions :"+sum);

	}

}
