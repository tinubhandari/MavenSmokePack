package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void loginTest() throws InterruptedException {
	  
	  System.out.println("In testng login test class updated ");
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Java\\SeleniumBeginner\\"
				+ "chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(5000);
	
	  
	  driver.quit();
	  
	  
  }
}
