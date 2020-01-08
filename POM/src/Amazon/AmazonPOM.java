package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPOM
{
	WebDriver driver;

   @BeforeTest
  public void setUp() 
  {

		
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Ashwini_Java\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");	  
  }
   
   @ Test(priority=0)
   public void test1()
   {
	   AmazonLoginPage obj=new AmazonLoginPage();
	   obj.AmazonLogin(driver);
	   obj.mainLogin("bashar.khairul.55@gmail.com", "sayed55@");
	   
   }
   
   @Test(priority=1)
   public void test2()
   {
	   AmazonHomePage obj1=new AmazonHomePage();
	   obj1.AmazonHome(driver);
	 //  obj1.getHomePageUserName();
	   System.out.println(obj1.getHomePageUserName());
   }
   
   @Test(priority=2)
   public void test3()
   {
	   AmazonSelectPage obj2=new AmazonSelectPage();
	   obj2.searchProduct(driver);
	   obj2.mainSearch("Books");
   }
   
   @Test(priority=3)
   public void test4() throws Exception
   {
	   AmazonAddCart obj3=new AmazonAddCart();
	   obj3.Amazon(driver);
	   obj3.mainAdd();
	   
			   
   }
   
   @Test(priority=4)
   public void test5()
   {
	   ProceedToBuy obj4=new ProceedToBuy();
	   obj4.Next(driver);
	   obj4.click();
	   obj4.chooseBankName();
   }
   
   

}
