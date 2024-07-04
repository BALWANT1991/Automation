package window_handles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
import org.testng.annotations.Test;

public class GetWindowHandles{
@Test
   public void windowHandle() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.tutorialspoint.com/index.htm");
      
        String currentwindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
      
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()){
         String childwindow = i.next();
         if(!childwindow.equalsIgnoreCase(currentwindow)){
            driver.switchTo().window(childwindow);
            System.out.println("The child window is "+childwindow);
         } else {
            System.out.println("There are no children");
         }
      }
      driver.quit();
   }
}
