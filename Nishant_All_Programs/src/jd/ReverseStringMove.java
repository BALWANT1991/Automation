package jd;

public class ReverseStringMove {

	public static void main(String[] args) {
		String name = "Nishant Narwade Nanded";
		
		 String[] arrOfStr = name.split(" ",4); 
		  
	        for (String a : arrOfStr) 
	        {
	        	int len=a.length();
	        	
	        	for(int i =0;i<len;i++) {
	        		System.out.println("Name is "+a);
	        	}
	        } 

	}

}
