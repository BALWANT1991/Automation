package arraysUse;

public class ArrayPassingDemo {
	   /* Search an element 'var' in the array
	    * Return the position (index) if element is found else return -1
	    */
	
	static int searchIndex(int[] arr, int val) {
	int pos=-1;

	for(int i =0;i<arr.length;i++) {
		
		if(arr[i]==val) {
			pos=i;
			break;
		}
		}
	
	return pos;
	}
public static void main(String[] args) {
	int arr [] = {25,86,101,78,96,55};
    int pos =	searchIndex(arr,55);
    if (pos != -1) {
        System.out.println("Element is found at position : " + pos);
     }
     else {
        System.out.println("\nElement not found ... ");
     }
	
	
	}
	
	
}
