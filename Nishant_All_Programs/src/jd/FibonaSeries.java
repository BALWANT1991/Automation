package jd;

import java.util.Scanner;

public class FibonaSeries {

	public static void main(String[] args) {
		int a =0;int b=0;int c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of series :");
		int num =sc.nextInt();
		
		System.out.println("Fabino series is  :");
		for(int i=0;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}

	}

}
