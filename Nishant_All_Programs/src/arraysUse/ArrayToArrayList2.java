package arraysUse;

import java.util.ArrayList;

public class ArrayToArrayList2 {

	public static void main(String[] args) {
		
		
		int [] array = {12,24,23,5,78,999,258};
		
		func(array);
	}

	public static void func(int[] array) {
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			
			al2.add(new Integer(array[i])); 
		}
		System.out.println(al2);
		
	}
}
