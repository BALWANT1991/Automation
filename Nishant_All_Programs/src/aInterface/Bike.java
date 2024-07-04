package aInterface;

public abstract class Bike {

   Bike() {
	   System.out.println("Bike Name Honda: ");	   
}
   abstract void bikeAverage(int y);
   
   void price(int z) {
	   System.out.println("On Prices :"+z);
   }
}

abstract class AllBike extends Bike{

	void bikeAverage() {
	System.out.println("Average is ");	
}
	void review(int g) {
		System.out.println("Star out of 5 is :"+g);
	}
	
}
 abstract class Normal extends AllBike{

	public static void main(String[]args) {
		
		
	
		
		}
	}
	

