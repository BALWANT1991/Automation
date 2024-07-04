package javaTpoint;

// Constructor example use

public class Customer {

	 private int var;
	 
	 private String name;
	 
     //default constructor
     public Customer()
     {
            this.var = 10;
     }
     //parameterized constructor
     public Customer(int num)
     {
            this.var = num;
     }
     public Customer(String name) {
    	 
    	 this.name = name;
     }
     
     public String nameInfo() {
    	 return name;
     }
     public int getValue()
     {
             return var;
     }
     public static void main(String args[])
     {
    	
    	 
    	 Customer obj = new Customer();
    	 Customer obj2 = new Customer(100);
    	 Customer obj3 = new Customer("Nishant");
           
    	 System.out.println("value is :"+obj3.nameInfo());
    	 System.out.println("var is: "+obj.getValue());
         System.out.println("var is: "+obj2.getValue());
     }

}
