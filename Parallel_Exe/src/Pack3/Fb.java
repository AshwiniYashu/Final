package Pack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fb {
	WebDriver driver;
  @Test
  public void f() 
  {

	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  System.out.println("done");
  }
}
