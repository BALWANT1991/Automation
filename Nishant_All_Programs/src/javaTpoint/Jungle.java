package javaTpoint;

public class Jungle {

	
	void tiger(int number) {
		System.out.println("Danger in foresrt");
	}
}
class Taaaappu extends Jungle{
	
	void tiger() {
		System.out.println("normal in tappu");
	}
	
	void UseInfo() {
		super.tiger(11);
		tiger();
	}
	
	public static void main(String [] nis) {
		
		Taaaappu tt = new Taaaappu();
		tt.UseInfo();
	}
}
