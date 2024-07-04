package javaTpoint;

public class Test {
	
	
	static int a=10;
	static int b=20;
	
	static void m1()
	{ 
		
	Test t = new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	
	}
	
	static void m2(){ 
		
		
	    System.out.println(a);
	    System.out.println(b);
	
	}
	
	public static void main(String[] args)
	{
		Test.m1(); //static method calling
	    Test.m2(); //static method calling
	}
}
