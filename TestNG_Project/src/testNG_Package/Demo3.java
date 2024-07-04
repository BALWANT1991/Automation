package testNG_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {

	@AfterSuite
	public void aftersuite() {
		System.out.println("I am last in Suite");
	}

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}

	@Test(groups= {"Regression"})
	public void circle() {
		System.out.println("Circle");

	}

	@Test
	public void square() {
		System.out.println("Square");
	}

	@AfterTest
	public void rectangle() {
		System.out.println("rectangle");
	}

}
