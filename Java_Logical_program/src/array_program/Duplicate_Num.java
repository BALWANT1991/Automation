package array_program;

public class Duplicate_Num {

	public static void main(String[] args) {
		int a[]= {11,22,33,11,33,44,66,77,55,44,99,55,99};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate num:"+ a[i]);
				}
				
			}
			
		}
				
	}
}
