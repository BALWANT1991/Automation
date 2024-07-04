package javaExample;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the Any Year :");
    int lp = sc.nextInt();
    if(lp%4==0){
    	System.out.println("This is Laep Year :"+lp);
    }
    else {
    	System.out.println("this is not leap year");
    }
	}

}
