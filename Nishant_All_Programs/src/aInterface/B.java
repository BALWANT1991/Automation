package aInterface;

public abstract class B implements A {

	final int x =10;
	
	public static String xx="Nishant";
	
	public void c(){
		
		
		System.out.println("I am C");
		
	}  
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
	
	
public void a(){
	System.out.println("I am a");
	}  

public void b(){
	System.out.println("I am b");
	}  

public void d(){
	System.out.println("I am d");
	}
 
}

//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  

	A a=new M(); 
	
	System.out.println(a.xy);
	System.out.println(A.xy);
	
	System.out.println(B.xx);
	
	a.a();  

	a.b();  

	a.c();  

	a.d();  
}}