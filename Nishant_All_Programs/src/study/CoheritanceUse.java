package study;

public class CoheritanceUse {
	
	CoheritanceUse get()
	{
		return this;
		}  
	}  
	  
	class B1 extends CoheritanceUse{  
	B1 get(){
		return this;
		}  
	void message(){
		
		System.out.println("welcome to covariant return type");
		
	}  
	  
	public static void main(String args[]){  
	
		new B1().get().message();  
	}  
	}


