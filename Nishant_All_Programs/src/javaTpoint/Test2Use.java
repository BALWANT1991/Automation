package javaTpoint;

public class Test2Use {
	
	
	int a=10;
	int b=20; // instance variables
	static int c=30;//static variables
	static int d=40; //static variables
	
	void m1() //instance method
	{ 
	System.out.println(a);
	System.out.println(b);
	System.out.println(Test2Use.c);
	System.out.println(Test2Use.d);
	
	}
	
	static void m2() //static method
	                   {
	Test t = new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(Test2Use.c);
	System.out.println(Test2Use.d);
	}
	
	public static void main(String[] args)
	{
	
	Test t = new Test();
	t.m1(); //instance method calling
	Test.m2(); //static method calling
	
	}

}
