package string_program;

public class Replace_Char_Using_Loop {
	static String string="Balwantsingh";

	public static void main(String[] args) {
		Replace_Char_Using_Loop.replaceLetter(string);
	}
	  public static void replaceLetter(String string){
	        string = string.toLowerCase();
	        for (int i = 0; i < string.length(); i++){
	            if (string.charAt(i) == 'h'){
	            //System.out.println("inside if " + i);
	              //System.out.println("Char at " + string.charAt(i));
	                System.out.println(string.replace(string.charAt(i), '$'));
	                break;
	            }
//	            System.out.println("Outside if " + i);
	        }
	    }
}
