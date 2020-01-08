package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon
{
	WebDriver driver;
  @Test
  public void f()
  {
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Ashwini_Java\\chromedriver_win32\\chromedriver.exe");

	  //driver=new FirefoxDriver();
	  driver=new ChromeDriver();

	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
  }
}
