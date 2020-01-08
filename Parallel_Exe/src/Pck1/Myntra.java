package Pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Myntra 
{
	WebDriver driver;
	
  @Test
  public void f()
  {

	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  System.out.println("done");

	  
  }
}
