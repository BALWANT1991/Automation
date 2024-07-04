package seleniumUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStudy2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		//li[@class='a-carousel-card']//div//span//a//img[contains(@alt,'')]


		List<WebElement> list =driver.findElements(By.xpath("//li[@class='a-carousel-card']//div//span//a//img[contains(@alt,'')]"));
		int size =list.size();
	
		System.out.println(size);
		
		
		for(WebElement element:list)
		{
			
		System.out.println(element.getAttribute("alt"));
		
		if(element.getAttribute("alt").equals("Up to 60% off TVs and appliances")) {
			
			WebElement ele = driver.findElement(By.xpath("//div[@id='gw-ftGr-desktop-tall-hero-F']//div[@class='cropped-image-link image-map shogun-widget card-lite ameyal-cropped-image-link']//a[@class='a-link-normal aok-inline-block']//img"));
			   Thread.sleep(3000);
			   
			   //Javascript command
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("scroll(250, 0)");
			   js.executeScript("arguments[0].click();", ele);
			   break;
			
		}
		else  {
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
		}
			}
				
	}
}
