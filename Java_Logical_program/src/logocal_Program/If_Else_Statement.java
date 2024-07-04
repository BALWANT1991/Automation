package logocal_Program;

import java.util.Scanner;

public class If_Else_Statement {

	public static void main(String[] args) {
    boolean flag = false;
    System.out.println("Enter input Number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=2;i<=num/2;i++) {
    	if(num%2==0) {
    flag=true;
    break;
    	}
    }
    if(!flag) {
    	System.out.println(num+":is prime number");
    }else {
    	System.out.println(num+":12Not prime number");
    }
    
	}

}
