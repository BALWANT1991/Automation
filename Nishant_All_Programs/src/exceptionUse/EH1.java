package exceptionUse;

public class EH1 {

	public static void main(String[] args) {
	
		String s=null;  
		try {
			
			System.out.println("the value of s :"+s);
		} 
		
		
		catch (NullPointerException e) {
			
			e.printStackTrace();
		}
		 	

}
}