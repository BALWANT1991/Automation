package jd;

import java.util.Scanner;

public class ReverseStringBYUserInput {

	public static void main(String[] args) {
		String rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter the Name :");
		String str =sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev +str.charAt(i);
		}
         System.out.println("Reverse String is  :"+rev);
	}

	}
