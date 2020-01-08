package Pack1;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class DataD1 
{
	WebDriver driver;
  @Test(dataProvider = "Login")
  public void f(String Author, String Search_Key) throws Exception
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Ashwini_Java\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  WebElement e1=driver.findElement(By.name("q"));
	  e1.sendKeys(Search_Key);
	  Thread.sleep(1000);
	  System.out.println("Author"+Author);
	  e1.clear();
	  
  }

  @DataProvider(name="Login")
  public Object[][] data() throws Exception 
  {
	  String[][] array1=getExcelData("C:\\Users\\User\\Desktop\\MyExcel\\NewBook.xls","First");
    return array1;
      
   
  }

private String[][] getExcelData(String filename, String sheetname) throws Exception, IOException
{
	FileInputStream fs=new FileInputStream(filename);
	Workbook wb=Workbook.getWorkbook(fs);
	Sheet sh=wb.getSheet(sheetname);
	
	int rows=sh.getRows();
	int coloumns=sh.getColumns();
	
	String array2[][]=new String [rows-1][coloumns];
			for(int i=1; i<rows; i++)
			{
				for(int j=0; j<coloumns; j++)
				{
					array2[i-1][j]=sh.getCell(j,i).getContents();
				}
			}
	
	return array2;
}
}
