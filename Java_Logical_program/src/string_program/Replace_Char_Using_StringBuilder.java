package string_program;

public class Replace_Char_Using_StringBuilder {
	static String string="Balwantsingh";

	public static void main(String[] args) {
		String replace = Replace_Char_Using_StringBuilder.replaceLetter(string);
		System.out.println(replace);
	}
	public static String replaceLetter(String string){

	    StringBuilder stringBuilder = new StringBuilder(string);
	    for (int i = 0; i < stringBuilder.length(); i++){
	        if (stringBuilder.charAt(i) == 'h'){
	            stringBuilder.setCharAt(i, '$');
	            break;
	        }
	    }
	    return stringBuilder.toString();
	}
}
