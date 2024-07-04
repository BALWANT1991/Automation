package logocal_Program;

import java.util.Scanner;

public class Compare_Two_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String:");
		String firstString=sc.next();
		System.out.println("Enter Second String");
 		String secondString=sc.next();
 		compareString(firstString,secondString);
	}
	public static void compareString(String s1,String s2) {
		if(s1.compareTo(s2)==0) {
			System.out.println("String is Equal");
		}
		else {
			System.out.println("String is not Equal");
		}
	}

}
