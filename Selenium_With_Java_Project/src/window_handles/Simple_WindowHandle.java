package window_handles;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_WindowHandle {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// I just launched browser. Did not load any URL
		System.out.println(driver.getWindowHandle());
		// Quitting browser
		// Calling get window handle method
		System.out.println(driver.getWindowHandles().size());
		driver.quit();
	}
}
