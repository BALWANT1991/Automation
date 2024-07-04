package seleniumUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextButton {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://docs.angularjs.org/tutorial/step_07");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h2[@id='summary']//following-sibling::ul//a//li[contains(text(),'Next')]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='ng-scope']//ul[1][@class='ng-scope ng-isolate-scope btn-group tutorial-nav']//a//li//i[@class='glyphicon glyphicon-step-forward']")).click();

			System.out.println("End");			

	}

}
