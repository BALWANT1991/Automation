package aInterface;

public abstract class Car {

	void tyre() {System.out.println("tyre is Must to car");}
	void tank() {System.out.println("tank is Needed");}
    abstract void ac();
    static void stering() {System.out.println("steyring is needed");}
}	


abstract class Bmw extends Car{	
	
	void ac() {
		System.out.println("optional part");
	}
	
}
class NormalCar extends Bmw{
	
	public static void main(String[] args) {
		NormalCar.stering();
	}

}
