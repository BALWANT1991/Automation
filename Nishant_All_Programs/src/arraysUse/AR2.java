package arraysUse;

public class AR2 {
	
	
	public static void main(String[] args) {
		int[][] matrix = new int[10][5];
		
		int total = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			
		    for (int column = 0; column < matrix[row].length; column++) {
		   
		    total = total + matrix[row][column];
		    }
		}
		System.out.println("Addition is :"+total);
	}

}
