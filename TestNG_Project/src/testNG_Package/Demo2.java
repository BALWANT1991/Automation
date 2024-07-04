package testNG_Package;

import org.testng.annotations.*;

public class Demo2 {
	
	@Test
	public void pen() {
		System.out.println("Pen");
		
	}

	@Test
	public void pencil() {
		System.out.println("Pencil");
	}

	@Test
	public void erazer() {
		System.out.println("Erazer");
	}

	@Test(groups= {"Regression"})
	public void Sharpner() {
		System.out.println("Sharpner");
	}

	@BeforeTest
	public void scale() {
		System.out.println("Scale");
	}

}
