package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager; 
public class LoginStepDef {
	 WebDriver driver;
   // private static final Logger logger = LogManager.getLogger(LoginStepDef.class);
	
	@Given("^User is already on Login page$")
	public void user_is_already_on_Login_page()  {
		//logger.info("User present on login page");
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\Chrome_Driver_123\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.manage().window().maximize();
	}

	@When("^Title of free CRM Page$")
	public void title_of_free_CRM_Page()  {
		//logger.info("User validate login page");
		String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, title);
	}

	@When("^User enter username and Password$")
	public void user_enter_username_and_Password()  {
		//logger.info("User enter valid credential");
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	  
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button()  {
		//logger.info("User click on login button");
	WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
	element.click();
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		//logger.info("User Validate home page");
		String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, title);
	}
	
	@Then("^User close browser$")
	public void user_close_browser()  {
		//logger.info("User close the browser");
		driver.close();
	}

}
