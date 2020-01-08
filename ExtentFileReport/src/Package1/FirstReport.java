package Package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FirstReport 
{
	 @Test
	  public void StartReport()
	  {
		  ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		  Object test = report.startTest("Demostarts");
		  }
		  public void extentReportsDemo()
		  {
		  System.setProperty("webdriver.firefox.driver", "C:\\rogram Files\\Ashwini_Java\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  ExtentTest test;
		if(driver.getTitle().equals("Facebook"))
		  {
		  test.log(LogStatus.PASS, "Test Passed");
		  }
		  else
		  {
		  test.log(LogStatus.FAIL, "Test Failed");
		  }
		  }
		  
		  
		  @AfterClass
		  public static void endTest()
		  {
		  ExtentReports report;
		ExtentTest test;
		report.endTest(test);
		report.flush();
		  }



	      test.log(LogStatus.FAIL,test.addScreenCapture(void capture_shot(driver))+ "Test Failed");
	      public static String capture_shot(WebDriver driver) throws IOException 
	      {
	      File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      File Dest = new File("src/" + ".png");
	      String errflpath = Dest.getAbsolutePath();
	      FileUtils.copyFile(srcFile, Dest);
	     return errflpath;
	}

}
