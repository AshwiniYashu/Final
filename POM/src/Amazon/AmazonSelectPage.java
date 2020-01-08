package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSelectPage 
{
	WebDriver driver;
	By SearchField=By.xpath("//input[@id='twotabsearchtextbox']");
	By Search=By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	
	public void searchProduct(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setSearchProdut(String Search_Product)
	{
		driver.findElement(SearchField).sendKeys(Search_Product);
	}
	public void clickSearch()
	{
		driver.findElement(Search).click();
	}
	
	public void mainSearch(String Search_Product)
	{
		this.setSearchProdut(Search_Product);
		this.clickSearch();	
	}
	

}

