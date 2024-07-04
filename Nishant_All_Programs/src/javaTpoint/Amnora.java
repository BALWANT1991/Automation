package javaTpoint;

public class Amnora {

	
	 static void m1(){System.out.println("parent m1()");}	
}
class Mall extends Amnora{
	
	
	static void m1(){
		System.out.println("child m1()");
		}
	
	public static void main(String[] args)
	{ 
		Amnora p = new Mall();
	  //  p.m1(); //output : parent m1()
	}
}