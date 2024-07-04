package study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
	        
	        
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	        
	        //To get source locator
	        
	        Thread.sleep(5000);
	       
	        WebElement sourceLocator = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
	        //To get target locator
	        WebElement targetLocator = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	        //create object 'action' of Actions class
	        Actions action = new Actions(driver);
	        Thread.sleep(5000);
	        //use dragAndDrop() method. It accepts two parametes source and target.
	        action.dragAndDrop(sourceLocator, targetLocator).build().perform();

	}

}
