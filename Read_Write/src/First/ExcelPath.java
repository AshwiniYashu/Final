package First;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPath 
{

	
		XSSFWorkbook wb;
		XSSFSheet sh;
		FileInputStream f;
		FileOutputStream fout;
		
		void ExcelPath() throws Exception
		{
		File src=new File("C:\\Users\\User\\Desktop\\Excel.xlsx");
		f= new FileInputStream(src);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheetAt(0);
		fout=new FileOutputStream(src);
		wb.write(fout);

		} 
		
		void getwrite() throws Exception
		{
		sh.getRow(0).createCell(3).setCellValue("Ashwini");
		sh.getRow(1).createCell(3).setCellValue("Ayushma");
		sh.getRow(2).createCell(3).setCellValue("Komal");
		sh.getRow(3).createCell(3).setCellValue("Khairul");

		f.close();
		}
		void read() throws Exception 
		{
		String data=sh.getRow(0).getCell(1).getStringCellValue();
		String d1=sh.getRow(1).getCell(1).getStringCellValue();
		String d2=sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(data+"\n"+d1+"\n"+d2);
		//f.close();
		}

}

class check
{
	public static void main(String args[]) throws Exception 
	{
		ExcelPath p=new ExcelPath();
		p.ExcelPath();
		p.getwrite();
		p.read();
	}
}
