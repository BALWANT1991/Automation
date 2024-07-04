/**
 * 
 */
package arraysUse;
import java.util.*;

/**
 * @author nishant.narwade
 * ArrayList1 and ArrayList2 add in ArraysList3
 * by addAll Method.
 */
public class TwoArraysAdd {
	public static void main(String[] args) {
		
		ArrayList<String>arr1 = new ArrayList<String>();
		arr1.add("AR1 :E1");
		arr1.add("AR1 :E2");
		arr1.add("AR1 :E3");
		arr1.add("AR1 :E4");
		
		ArrayList<String>arr2 = new ArrayList<String>();
		arr1.add("AR2 :E1");
		arr1.add("AR2 :E2");
		arr1.add("AR2 :E3");
		arr1.add("AR2 :E4");
		
		ArrayList<String>addition = new ArrayList<String>();
		addition.addAll(arr1);
		addition.addAll(arr2);
		
		//Displaying elements of the joined ArrayList
        for(String temp: addition){
            System.out.println(temp);
        }
		
		

	}

}
