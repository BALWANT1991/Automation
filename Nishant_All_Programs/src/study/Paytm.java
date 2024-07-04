package study;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div/div[3]/img")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[6]/div/div/div/div/div/div[1]/div/div/img"))
				.click();
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div[@class='react-datepicker']//a"));
		Actions action = new Actions(driver);

		action.moveToElement(element).moveByOffset(250, 0).click().build().perform();

		Thread.sleep(5000);
		System.out.println("Got it ans");
//           action.moveToElement(element).moveByOffset(124, 0).click().build().perform();
		driver.findElement(By.xpath("//button[@class='button button--default button--bold _3Su5']")).click();
		System.out.println("Successfully Run");
		//driver.quit();
	}

}
