/**
 * 
 */
package aInterface;

/**
 * @author nishant.narwade
 *
 */
public interface Application {

	void playstore();
	void whatsapp();
	
}

interface Setting extends Application {
	
	void timeSetting();
	void mobileData();
}

class MobileApp implements Setting{
	
	@Override
	public void playstore(){
	System.out.println("smart phone basic app -playstore");	
	}

	@Override
	public void whatsapp() {
		System.out.println("smart phone basic app -whatsapp");	
		
	}

	@Override
	public void timeSetting() {
		System.out.println("smart phone basic app -timesetting");	
		
	}

	@Override
	public void mobileData() {
		System.out.println("smart phone basic app -mobileData");	
		
	}
	
	public static void main(String [] args) {
		MobileApp m  = new MobileApp();
		m.mobileData();
		m.playstore();
		m.timeSetting();
		m.whatsapp();
		
		Setting s = new MobileApp();
		s.whatsapp();
		
	}
}