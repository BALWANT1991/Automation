package testNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Browser launch");
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Browser closed");
		
	}
	
	@Parameters({"URL","password"})
	@Test
	public void login(String userName, String userPass) {
		System.out.println("Login Application");
		System.out.println(userName);
		System.out.println(userPass);
	}

	@Test(groups= {"Regression"})
	public void perform() {
		System.out.println("Application Perform");
	}

	@Test(dataProvider="getData")
	public void dataEnter(String user,String pass) {
		System.out.println("Enter the data");
		System.out.println(user);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="firstName";
		data[0][1]="firstPass";
		
		data[1][0]="secondtName";
		data[1][1]="secondPass";
		
		data[2][0]="thirdName";
		data[2][1]="thirdPass";
		return data;
		
	}


	@Test
	public void checkData() {
		System.out.println("Check data");
	}

	@Test(dependsOnMethods={"login"})
	public void SignOut() {
		System.out.println("Application Sigh out");
	}

}
