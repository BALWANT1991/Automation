package javaExample;
 class Base {
	
	 public void Print() {
	        System.out.println("Base");
	    }         
	}
	 
	class Derived extends Base {    
	    public void Print() {
	        System.out.println("Derived");
	    }
	}
	
	class Ipl extends Derived{
		public void Print() {
			System.out.println("Humpire");
		}
	}
	 
	class Main{
	    public static void DoPrint( Base o ) {
	        o.Print();   
	    }
	    public static void main(String[] args) {
	        Base x = new Base();
	        Base y = new Derived();
	        Derived z = new Derived();
	        Ipl i = new Ipl();
	        DoPrint(i);
	        DoPrint(x);
	        DoPrint(y);
	        DoPrint(z);
	    }
	}
