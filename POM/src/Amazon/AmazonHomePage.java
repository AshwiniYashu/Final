package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage
{
	WebDriver driver;
	By HomePageUseName=By.xpath("//span[contains(text(),'Hello, Khairul')]");


	public void AmazonHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getHomePageUserName()
	{
		return driver.findElement(HomePageUseName).getText();
	}
}
