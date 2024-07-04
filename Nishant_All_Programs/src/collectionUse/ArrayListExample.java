package collectionUse;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String []args){
		
		
	ArrayList<String> al = new ArrayList<String>(20);
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	al.add("E");
	
	  //Convert to object array
    Object[] arr = al.toArray();
       
    
    
    System.out.println( Arrays.toString(arr) );
    
    //Iterate and convert to desired type
    for(Object o : arr) {
        String s = (String) o;
         
        System.out.println(s);
    }
}
	
	
}