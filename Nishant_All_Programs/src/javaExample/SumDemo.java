package javaExample;
import java.util.*;

public class SumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		for(int i =1;i<=10;i++) {
			
			System.out.println("Enter the Number:"+i);
			int xx =sc.nextInt();
			
			sum = sum+xx;
		}
       System.out.println("Addition of User input Number is :"+sum);
	}

}
