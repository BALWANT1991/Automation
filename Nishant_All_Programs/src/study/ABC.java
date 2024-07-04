package study;

public class ABC {
	
	
	ABC(){
		
		System.out.println("RAW-parent");
	}
	public void myMethod()
	   {
		System.out.println("Overridden method-Super keyword use");
	   }	   
	}
	class Demo extends ABC{
		
		
		Demo(){
		}
	   public void myMethod(){   
		//This will call the myMethod() of parent class

			super.myMethod();
		   System.out.println("Overriding method");
		}
	   public static void main( String args[]) {
		   Demo obj = new Demo();
		   obj.myMethod();
	   }
}
