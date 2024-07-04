package java_Study;

public class Animal {

	String color ="White";
	
	void PaytmPayment() {
		System.out.println("mode of transations : Payment");
	}
}



class Horse extends Animal{
	
	String color ="Black";
	
	void CheckColor() {
		System.out.println("This is Browen Color of Horse :"+color);
		System.out.println("This is white Color of Animals :"+super.color);
	
	}
	void PaytmPayment() {
		System.out.println("mode of transations : Payment2");
	}
	public static void main(String [] args) {
		Horse h = new Horse();
		h.CheckColor();
	}
	
	
}