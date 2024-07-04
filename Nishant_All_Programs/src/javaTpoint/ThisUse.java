package javaTpoint;

public class ThisUse {

	int rollno;  
	String name;  
	float fee;  
	
	
	
	ThisUse(int rollno,String name,float fee){  
	this.rollno=rollno;;  
	this.name=name;  
	this.fee=fee;  
	}  
	
	
	
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  


	  
class TestThis2{  
	
	public static void main(String args[]){  
		ThisUse s1=new ThisUse(111,"ankit",5000f);  
		ThisUse s2=new ThisUse(112,"sumit",6000f);  
	    s1.display();  
	    s2.display();  
	}
}
