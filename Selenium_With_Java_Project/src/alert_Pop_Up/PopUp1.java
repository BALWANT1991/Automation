package alert_Pop_Up;
import java.time.Duration;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PopUp1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);	
//		driver.manage().window().maximize();
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("disha-banner-close")));
//		closeButton.click();
//		Thread.sleep(1000);
//		System.out.println("Hello");
//		driver.findElement(By.xpath("//*[@id='nlpCubeBox200X200']/div/div[1]/span[1]/img")).click();
//		Thread.sleep(1000);	      
       Alert alt = driver.switchTo().alert();
	  String altsms = driver.switchTo().alert().getText();
		System.out.println(altsms);
		alt.accept();
		alt.dismiss();
	}
}
