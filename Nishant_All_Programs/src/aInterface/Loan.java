/**
 * 
 */
package aInterface;

/**
 * @author nishant.narwade
 *
 */
public class Loan implements Bank2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Loan l = new Loan();
	
		System.out.println(	l.rateOfinterest());

		Bank2 b = new Loan();
		System.out.println(b.rateOfinterest());
		System.out.println("name is  :"+b.KYC());
	}

	@Override
	public int rateOfinterest() {
		
		return 5;
	}

	@Override
	public String KYC() {

		return "nishant";
	}

}
