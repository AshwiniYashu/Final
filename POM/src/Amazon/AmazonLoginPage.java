package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginPage 
{
	WebDriver driver;
	
	By UserName=By.name("email");
	By Continue=By.id("continue");
	By Password=By.name("password");
	By Loginbutton=By.id("signInSubmit");


	public void AmazonLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUserName(String strUserName)
	{
		driver.findElement(UserName).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword)
	{
		driver.findElement(Password).sendKeys(strPassword);
	}
	

	public void Continue()
	{
		driver.findElement(Continue).click();
		
	}	
	public void clickLogin()
	{
		driver.findElement(Loginbutton).click();
	}
	 public void display()
	 {
		 System.out.println("done");
	 }
	public void mainLogin(String strUserName, String strPassword)
	{
		this.setUserName(strUserName);
		this.Continue();
		this.setPassword(strPassword);
		this.clickLogin();
	}

	}
