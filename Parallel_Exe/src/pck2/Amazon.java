package pck2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon 
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  System.out.println("done");

	  
	  
  }
}
