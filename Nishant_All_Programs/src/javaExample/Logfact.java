package javaExample;

public class Logfact {
	
	 public static double fact(int n) 
	    { 
	        if (n == 1) 
	        	
	            return 0; 
	        
	        return fact(n - 1) + Math.log(n);
	    } 
	  
	    public static void main(String[] args) 
	    { 
	  
	        int N = 5; 
	        System.out.println(fact(N)); 
	    } 
}
