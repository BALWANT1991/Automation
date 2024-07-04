package javaExample;

import java.util.Scanner;

public class SwitchCaseExample2 {
	
	public static void main(String args[]){
		
	  //    int i=2;
	      
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the Number :");
	     
	     int i =sc.nextInt();
	     
	      switch(i)
	      {
		 case 1:
		   System.out.println("Case1 ");
		 case 2:
		   System.out.println("Case2 ");
		 case 3:
		   System.out.println("Case3 ");
		 case 4:
	           System.out.println("Case4 ");        
		 case 5:
			 System.out.println("Case 5");
			 
		 case 6 :
			 System.out.print("My name is Nishant");
		 default:
		   System.out.println("Default ");
	      }
	   }
}
