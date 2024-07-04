package study;
public class RBI {

	void intrestrate() {
		System.out.println("rbi");
	}
}
class SBI extends RBI{
	
	void intrestrate() {
		System.out.println("SBI not intrested");
	}
	public static void main(String [] args) {
		SBI s = new SBI();
		s.intrestrate();
	}
} 