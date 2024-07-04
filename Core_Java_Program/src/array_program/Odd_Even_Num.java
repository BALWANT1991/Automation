package array_program;

import java.util.Arrays;

public class Odd_Even_Num {

	public static void main(String[] args) {

		int a[]={12,34,01,87,91,0,2,3};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				System.out.println("Even Numbers:"+ a[i]);
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				
				System.out.println("Odd Numbers:"+ a[i]);
				
			}
		}
		
		int x = a.length-1;
		System.out.println("Largest Num:"+ a[x]);

		int y = a.length-2;
		System.out.println("2nd Largest Num:"+ a[y]);
	}

}
