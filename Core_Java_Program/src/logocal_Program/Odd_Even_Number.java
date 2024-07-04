package logocal_Program;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) {

		//int num[]= {12,34,11,57,90,88,56};
		Scanner sc=new Scanner(System.in);
		int inputNumber = sc.nextInt();
		findNumber(inputNumber);
		
		}

	public static void findNumber(int inputNumber) {
		if(inputNumber%2!=0) {
			System.out.println("Number is odd:"+inputNumber);
		}
		else{
			System.out.println("Number is Even:"+inputNumber);
		}
	}

}
