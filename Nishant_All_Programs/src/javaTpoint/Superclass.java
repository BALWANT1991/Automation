package javaTpoint;

public class Superclass {
	
	int num = 100;
	String name ="Nishant";
	
	
	
	public void superClass() {
		
		
	System.out.println("this is start Method");
	}
}





	class Subclass extends Superclass
	{
	   int num = 110;
	   
	
	   void printNumber(){
		/* Note that instead of writing num we are
		 * writing super.num in the print statement
		 * this refers to the num variable of Superclass
		 */
		   super.superClass();
		   System.out.println(super.num);
		   
	 
	   }
	
	   public static void main(String args[]){
	
		   Subclass obj= new Subclass();
		   obj.printNumber();	
	   }
}
