package aInterface;

public abstract class Bank {
	
	abstract int getRateOfInterest(); 
	abstract String interestArea();	
}
abstract class SBI extends Bank {

	int getRateOfInterest() {
		return 8;
	}
}	
class BOB extends SBI{
	
	  String interestArea() {	    	
	    	return "Homeloan";
	    }
	  boolean sign() {
		  return true;
	  }
}  

class IDBI extends BOB{

	public static void main(String[] args) {
		
		IDBI i = new IDBI();
		System.out.println(i.getRateOfInterest());
		System.out.println(i.sign());
		System.out.println(i.interestArea());
		
		Bank  b = new BOB();
		System.out.println(b.getRateOfInterest());
		System.out.println(b.interestArea());

	}

}
