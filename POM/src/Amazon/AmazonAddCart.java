package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonAddCart
{
	WebDriver driver;
	
	By CheckBox=By.xpath("//li[@id='p_n_feature_nineteen_browse-bin/4729244031']//i[@class='a-icon a-icon-checkbox']");
	By Book=By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']");
	By AddCart=By.xpath("//button[@id='add-to-ebooks-cart-button']");
	
	public void Amazon(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectCheckBox() 
	{
		driver.findElement(CheckBox).click();
	}
	
	public void selectBook()
	{
		driver.findElement(Book).click();
	}
	public void AddProduct() throws InterruptedException
	{
		driver.get("https://www.amazon.in/Pokemon-Kids-Learn-Favorite-Characters-ebook/dp/B081X2TMWF/ref=sr_1_1?keywords=Books&qid=1575004322&refinements=p_n_feature_nineteen_browse-bin%3A4729244031&rnid=4729243031&s=digital-text&sr=1-1");

		driver.findElement(AddCart).click();
		Thread.sleep(1000);
	}
	
	public void mainAdd() throws Exception
	{
		//this.selectCheckBox();
		//this.selectBook();
		this.AddProduct();
	}
		
	}
