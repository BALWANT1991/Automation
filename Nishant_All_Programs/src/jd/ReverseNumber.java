package jd;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1258;
		int rev = 0,emp=0;
		
		while(num!=0) {
			num = num%10;
			rev = rev +num*10;
			num =num/10;		
		}
		System.out.println("reverse Number is :"+num);

	}

}
