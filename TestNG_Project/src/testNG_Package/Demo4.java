package testNG_Package;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test(groups= {"Regression"})
	public void red() {
		System.out.println("Red");
		
	}

	@Test
	public void yellow() {
		System.out.println("Yellow");
		Assert.assertTrue(false);
	}

	@Test
	public void orange() {
		System.out.println("Orange");
	}
	
	@BeforeSuite
	public void aftersuite() {
		System.out.println("I am First in Suite");
	}

}
