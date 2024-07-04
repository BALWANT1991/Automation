package arraysUse;

public class ArrayReturnDemo {
	
	static void normalMethod(int arr []) {
		for ( int element : arr ) {
	         System.out.print(element + " ");
	      }
	}
	
	
	
	static int [] rMethod(int narr [] ) {
		 int aux_array[] = new int[narr.length];
		 
		 for(int i =0;i<narr.length;i++) {
			 /* multiply each element by 10 */
	         aux_array[i] = narr[i] * 10;
		 }
		
		
		return aux_array ;
		
	}
	
	public static void main(String[] args) {
		int arr [] = {21,25,89,75,689,33,77};
		int narr[]= {25,54,78,98,22,35,64544,787};
		normalMethod(arr);
	System.out.println(rMethod(narr));
	}
}
