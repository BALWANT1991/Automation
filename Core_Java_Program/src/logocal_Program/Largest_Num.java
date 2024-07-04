package logocal_Program;

import java.util.Arrays;

public class Largest_Num {

	public static void main(String[] args) {
    int num[]= {12,13,90,87,67,100};
	Arrays.sort(num);
	
	for(int i=0;i<=num.length-1;i++) {
		System.out.println(num[i]);
	}
	int large = num.length-1;
	int secLarge=num.length-2;
	System.out.println("Largest Number:"+num[large]);
	System.out.println("Second Largest Num:"+num[secLarge]);
	}

}
