package java_Study;

public class Operation2 {
	
	int data=50;  
	
	String str ="Nishant";
	
	float sal= 658934.38975685f;
	  
	 void change(Operation2 op)
	 {  
		 
	 op.data=op.data+100;//changes will be in the instance variable  
	
	 }  
	 void NameChange(Operation2 op) {
		op.str=op.str+" Narwade";
	 }
	 
	 void MySalary(Operation2 op) {
		op.sal= op.sal+237846178.875687f;
	 }
	     
	    
	 public static void main(String args[]){  
		 
		 
	   Operation2 op=new Operation2();
	  
	  
	   System.out.println("before change "+op.data);  
	   
	   op.change(op);//passing object  
	   op.NameChange(op);
	   op.MySalary(op);
	   
	   System.out.println("after change "+op.data);  
	   System.out.println("My name is :"+op.str);
	   System.out.println("My name salary is  :"+op.sal);
	  
	 }  
}
