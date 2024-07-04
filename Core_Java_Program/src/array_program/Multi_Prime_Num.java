package array_program;

public class Multi_Prime_Num {

	public static void main(String[] args) {
		
		int n[]= {11,12,13,44,55,67,71};
		for(int i=0;i<n.length-1;i++) {
			int p = n[i];
			int count = 0;
			
			for(int j=1;j<=p;j++) {
				if(p%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Its prime Number:"+ p);
			}
			else {
				System.out.println("Not prime number"+p);
			}
			
		}
		
	}
}
