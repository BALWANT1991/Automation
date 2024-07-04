package javaExample;

public class BreakExample1 {

	public static void main(String[] args) {
		
		int [] arr = {20,35,96,45,23,987,789,365};
		//System.out.println(arr[4]);
		/*
		 * for(int num:arr) {
		 * 
		 * if(num!=789) {
		 * 
		 * System.out.println(num); } }
		 */

		/*
		 * for(int i =0;i<arr.length;i++) {
		 * //System.out.println("Array List No :"+i+" value is "+arr[i]); }
		 */
		/*
		 * int i=0; while(i<arr.length) { System.out.println(arr[i]); i++; }
		 */
		
		int i=0;
		do {
			System.out.println(arr[i]);
			i++;
		}
		while(i <arr.length);
	}

}
