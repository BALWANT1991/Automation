package seleniumUse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStudy3 {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		

		List<WebElement> list =driver.findElements(By.xpath("//div[@class='a-section a-spacing-medium']//div//h2//a//span[contains(text(),'')]"));
		int size =list.size();
	
		System.out.println(size);
		
		
		for(WebElement element:list)
		{
	System.out.println(element.getText());
	
	if(element.getText().equals("Honor 8C (Blue, 4GB RAM, 32GB Storage)")) {
		element.click();
	}
	}

}}
