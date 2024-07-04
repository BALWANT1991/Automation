package javaTpoint;

public class Car {
	
	Car(){
		System.out.println("first car");
	}
	
	
	Car(String car){
		System.out.println("This is Parent Car");
	}

}

class TataCar extends Car{

	TataCar(){
		super("Benz");
	}
	
	 void display(){
			System.out.println("Hello");
		   }
	public static void main(String [] args) {
		
		
		Car cc = new Car();
	
		TataCar t = new TataCar();
		t.display();
		
		
	}
	
}
