package javaExample;

public class Website {
	//fields (or instance variable)
	   String webName;
	   int webAge;

	   // constructor
	   Website(String name, int age){
	      this.webName = name;
	      this.webAge = age;
	   }
	   public static void main(String args[]){
	      //Creating objects
	      Website obj1 = new Website("beginnersbook", 5);
	      Website obj2 = new Website("google", 18);
	      Website obj3 = new Website("Facebook",322);

	     //Accessing object data through reference
	     System.out.println(obj1.webName+" "+obj1.webAge);
	     System.out.println(obj2.webName+" "+obj2.webAge);
	      System.out.println(obj3.webName+" "+obj3.webAge);
	   
	   }
}
