package jd;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxOpen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Deva\\Automation_Test_Engineer\\Nishant_All_Programs\\All_driver\\geckodriver.exe");
	
		File pathBinary = new File("C:\\Users\\nishant.narwade\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
	
		//DesiredCapabilities desired = DesiredCapabilities.firefox();
		
		FirefoxOptions options = new FirefoxOptions();
		
		//desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
	
		WebDriver driver = new FirefoxDriver(options);
	
		driver.get("https://www.google.co.in/");

	}

}
