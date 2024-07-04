package jd;

public class DigitNumber {

	public static void main(String[] args) {
		int number=1258;
		int count=0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println("this is Count "+count);

	}

}
