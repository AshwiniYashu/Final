package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToBuy 
{
	WebDriver driver;
	By PrceedToBuyProduct=By.xpath("//div[@class='a-column a-span3 a-span-last']//button[@id='proceed-to-checkout-btn']");
	By pass=By.xpath("//input[@id='ap_password']");
	By bank=By.xpath("//span[@id='select2-netBankingDropDown-4t-container']");
	By PlaceOrder=By.xpath("//button[@id='place-order-button']");
	
	public void Next(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click()
	{
		driver.findElement(PrceedToBuyProduct).click();
	}
	
	public void pass()
	{
		driver.findElement(pass).sendKeys("sayed55@");
	}
	
	public void chooseBankName()
	{
		driver.findElement(bank).sendKeys("Axis Bank");
		//Select s1=new Select(driver.findElement(bank));
		//s1.selectByIndex(2);
		driver.findElement(PlaceOrder).click();
		
	}

}
