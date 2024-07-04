/**
 * 
 */
package aInterface;

/**
 * @author nishant.narwade
 * 1. Constructor are not allowed
 * 2. in interface ,Normal method we can write Line -13,
 * 3 .Interface name is start with up[per letter
 * 4. return type is allowed but write with above modifier by compiler
 * 5. Any variable have public static final - by compiler
 * 6. Any method public abstract- by compiler
 * 7. Any method implement in interface by default - static or default
 * 8. inheritance by implements keyword
 */
 interface Telecom {

	public static  int a =19;
	 
	 public static final float f =4347856.783462f;
	 
	 void jio();
	 public void uninor();
	 public abstract void vodafone();
	 
	 static void airtel() {
		 System.out.println("Network is ok -Airtel");
	 }
	 
	 default void idea() {
		 System.out.println("strong newtork v-idea");
	 }
	 
	
	 
	 static int bsnl() {
		 return 10;
	 }
	 
class Network implements Telecom{
	public void jio(){
		System.out.println("growble network india - jio");
	}


	public void uninor() {
		System.out.println("out of india - uninor");
	}

	public void vodafone() {
		System.out.println("ok ok - vodafone");
	}
	
	public static void main(String [] args) {
		Network n = new Network();
		System.out.println(Telecom.bsnl());
		n.idea();n.uninor();n.jio();n.vodafone();
		System.out.println(Telecom.a);
		
		
	}
}
	 
}
