package array_program;

public class Simple_Prime_Num {

	public static void main(String[] args) {
	
		int p=11;
		int count=0;
		for(int i=1;i<=p;i++) {
			if(p%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("its Prime Number:-"+p);
		}
		else {
			System.out.println("not prime num");
		}
	}
	
	
}
