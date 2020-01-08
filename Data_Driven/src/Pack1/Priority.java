package Pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Priority 
{
	WebDriver driver;
  @Test(priority=0)
  public void f() 
  {
	  driver.get("https://www.facebook.com/");
  
  
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("komal sharma");
  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("komal123");
  driver.findElement(By.xpath("//input[@id='u_0_4']")).click();
  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
