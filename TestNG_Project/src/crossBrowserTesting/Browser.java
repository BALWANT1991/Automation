package crossBrowserTesting;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {

	@Test
	@Parameters("browser")
	public void openBrowser(String browser) throws InterruptedException {
		System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium_Automation\\Gecko_Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

	}
}