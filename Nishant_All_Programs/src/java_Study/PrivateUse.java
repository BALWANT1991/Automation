package java_Study;

public class PrivateUse {
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");
	}  
	}  

	

 class Check{  
	 public static void main(String args[]){  
		 PrivateUse obj=new PrivateUse();  
	  // System.out.println(obj.data);//Compile Time Error  
	   //obj.msg();//Compile Time Error  
	   } 
}
