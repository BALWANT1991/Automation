package testNG_Package;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(groups= {"Regression"})
	public void mobilePhone() {
		System.out.println("Mobile Phone");
		
	}

	@Test
	public void mobileSMS() {
		System.out.println("Mobile Sms");
	}

	@Test
	public void mobileCal() {
		System.out.println("Mobile Call");
	}
	
	@BeforeSuite
	public void mobileData() {
		System.out.println("Mobile data");
	}
	
	@Parameters({"URL"})
	@Test
	public void login(String userName) {
		System.out.println("Login Application");
		System.out.println(userName);
	}

}
