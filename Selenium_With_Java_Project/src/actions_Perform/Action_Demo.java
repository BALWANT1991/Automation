package actions_Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_rufybwi70_e&adgrpid=58372210709&hvpone=&hvptwo=&hvadid=617656877679&hvpos=&hvnetw=g&hvrand=13284018682980514155&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062096&hvtargid=kwd-316976912840&hydadcr=15411_2322987");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		Thread.sleep(5000);
		a.moveToElement(move).contextClick().build().perform();
		System.out.println("Welcome");
		driver.quit();
	}
}
