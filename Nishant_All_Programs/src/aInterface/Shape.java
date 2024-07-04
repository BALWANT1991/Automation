package aInterface;

public abstract class Shape {
	
	abstract void draw(); 
	
	 int x =10;
	
	}  


	//In real scenario, implementation is provided by others i.e. unknown by end user  
	class Rectangle extends Shape{  
		
		
	void draw(){System.out.println("drawing rectangle");}  
	}  
	
	class Circle1 extends Shape{  
		
	void draw(){System.out.println("drawing circle");}  
	}  
	
	class Cone extends Circle1{
		void draw2() {
			System.out.println("Only for Cone Structor ");
		}
	}
	//In real scenario, method is called by programmer or user  
	class TestAbstraction1{  
	public static void main(String args[]){  

		Cone s=new Cone();//In a real scenario, object is provided through method, e.g., getShape() method  
	 
	s.draw();
	s.draw2();
	
	Shape sd = new Cone();
	int  y=sd.x;
	System.out.println(y);
	
	
	}  
}
