package seleniumUse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStudy {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		String text =driver.findElement(By.xpath("//div[@id='gw-ftGr-desktop-tall-hero-F']//div[@class='cropped-image-link image-map shogun-widget card-lite ameyal-cropped-image-link']")).getAttribute("id");
		System.out.println(text);
		 
		 WebElement ele = driver.findElement(By.xpath("//div[@id='gw-ftGr-desktop-tall-hero-F']//div[@class='cropped-image-link image-map shogun-widget card-lite ameyal-cropped-image-link']//a[@class='a-link-normal aok-inline-block']//img"));
		   Thread.sleep(3000);
		   
		   //Javascript command
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("scroll(250, 0)");
		   js.executeScript("arguments[0].click();", ele);
		   System.out.println("pass");
		   
		//   	driver.findElement(By.xpath("//div[@id='101_dealView_3']")).click();
		   
		   //Click on 
		 
		 
		 
		 
	}

}
