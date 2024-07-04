package javaTpoint;

abstract class  Old{
	public void print() {
		System.out.println("old");
	}
	
	public abstract void pr();
}
abstract class Mid extends Old{
	/*ublic void print() {
		System.out.println("Mid");
	}*/
}
public class New extends Mid{
	
	public void print() {
		System.out.println("new");
	}
	public void pr() {
		super.print();
	}
	public static void main(String [] args) {
		Old o = new New();
		o.pr();
	}
}
