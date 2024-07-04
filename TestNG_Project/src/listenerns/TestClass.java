package listenerns;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	TestClass Test;
	String tcid;
	
	
	@BeforeClass
	public void browserlaunch() {
      Test = new TestClass();
      Test.initDriver();
   
	}
	
	@BeforeMethod
     public void login() {
		
		Reporter.log("login successfully");
	}   	
	
	@AfterMethod
		public void signup(ITestResult res) throws IOException {
		if(ITestResult.FAILURE==res.getStatus()) {
			Test.takescrnshot(tcid);
		}
		Reporter.log("signup successfully");
		}
	
	@Test
	public void tc01() {
	tcid="TCID-201";
		Reporter.log("tc01 running");
	       Assert.fail();
	}
	
	@Test
	public void tc02() {
		tcid="TCID-202";
		Reporter.log("tc02 running");
		
	}

}
