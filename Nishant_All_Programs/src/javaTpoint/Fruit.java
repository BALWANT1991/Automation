package javaTpoint;

public class Fruit {

	void eat() {
		System.out.println("Eat every food");
	}
}

class Banana extends Fruit{
	
	void eat() {
		System.out.println("Eat only banana food");
	}
	
	public static void main(String[] args) {

		Fruit f = new Fruit();
		f.eat();//Eat every food
		
		
		Banana b = new Banana();
		b.eat();//Eat only banana food
		
		Fruit ff = new Banana();
		ff.eat();//Eat only banana food
		
		

	}

}
