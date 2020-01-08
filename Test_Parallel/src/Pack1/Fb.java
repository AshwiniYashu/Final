package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fb 
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Ashwini_Java\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }
}
