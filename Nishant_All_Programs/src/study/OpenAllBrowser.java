package study;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenAllBrowser {

public static	WebDriver driver;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the browser name :");
		
		String browserName=sc.nextLine();
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
       System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
	
	}
		else if(browserName.equalsIgnoreCase("ff")) {
			
		       System.setProperty("webdriver.gecko.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.get("https://ui.cogmento.com/");
			
			}
		
		else {
			
		       System.setProperty("webdriver.ie.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\IEDriverServer.exe");
		        driver = new InternetExplorerDriver();
		        driver.get("https://ui.cogmento.com/");
			
			}
		
	}
	
//	"C:\Users\nishant.narwade\AppData\Local\Mozilla Firefox"
}
