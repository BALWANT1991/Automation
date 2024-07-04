package aInterface;

public interface State {

	public static int a =10;
	 
	
	void City();
	
}
class Distict implements State{

	@Override
	public void City() {
		System.out.println("City = nanded");
		System.out.println(State.a);
	}
	
	public static void main(String[]args) {
		Distict s= new Distict();
		s.City();
	}
	
}