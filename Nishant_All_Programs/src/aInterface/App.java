/**
 * 
 */
package aInterface;

/**how to achieve multiple inheritance by using interface
 * @author nishant.narwade
 *
 */
public interface App {

	interface Os {
		
		void os_Version();
	}
	
	void playStore();
	
}



class Mobile implements App.Os {
	
	
public void playStore() {
		System.out.println("WhatsApp");
	}
public void	os_Version(){
		System.out.println("kitkat version at least for installation properly");
	}
	
public static void main(String [] args) {
	Mobile m = new Mobile();
	m.playStore();
	m.os_Version();
	
	App.Os a = new Mobile();
	a.os_Version();
	
}
}