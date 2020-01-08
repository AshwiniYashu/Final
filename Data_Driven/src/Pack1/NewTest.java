package Pack1;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class NewTest
{
	WebDriver driver;
  @Test(dataProvider = "Login")
  public void f(String Author, String Search_Key) throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	  
	  WebElement e1 = driver.findElement(By.name("q"));
	  e1.sendKeys(Search_Key);
	  System.out.println("Welcome->"+Author);
	  Thread.sleep(3000);
	  e1.clear();
  }

  @DataProvider(name="Login")
  public Object[][] data() throws BiffException, IOException 
  {
	  Object[][]  array1=getExcelData("C:\\Users\\User\\Desktop\\Book1.xls","Sheet1");
	  return array1;
    
  }

private Object[][] getExcelData(String filename, String sheetname) throws BiffException, IOException 
{
		String[][] array2=null;
		FileInputStream fs=new FileInputStream(filename);
		Workbook wb=Workbook.getWorkbook(fs);
		Sheet sh=wb.getSheet(sheetname);
		
		int coloumns=sh.getColumns();
		int rows=sh.getRows();
	
		array2=new String[rows-1][coloumns];
		
		for(int i=1; i<rows;i++)
		{
			for(int j=0;j<coloumns;j++)
			{
				array2[i-1][j]=sh.getCell(j,i).getContents();
			}
		}
		return array2;
	
}
  
}
