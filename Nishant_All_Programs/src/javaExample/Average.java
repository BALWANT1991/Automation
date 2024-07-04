package javaExample;

public class Average {

	public static void main(String[] args) {
		
		
		double  [] arr = {320.23,56.25,8787.545,3,0.0045,70120.321};
		
		double total =0;
		
		for(int i=0;i<arr.length;i++) {
			
			total = total + arr[i];
		}
		System.out.println("Average of Arrays is "+total/arr.length);

	}

}
