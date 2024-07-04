package logicUse;

public class SecondSmallestInArrayExample {
	
	public static void main(String[] args) {
		int a[]={92,28,40,55,99,101,07,522};  
		
		System.out.println("Second smallest   : "+getSecondSmallest(a,8));
	}

	public static int getSecondSmallest(int[] a, int total ) {
	int temp ;
		
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }
		  
		System.out.println("Array Elements in Ascending Order: ");
        for (int k = 0; k < total - 1; k++) 
        {
            System.out.print(a[k] + ", ");
        }
        System.out.println(a[total - 1]);
        return a[1];//2nd element because index starts from 0  
	}
	

}
