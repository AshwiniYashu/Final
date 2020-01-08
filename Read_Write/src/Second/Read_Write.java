package Second;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write 
{
	FileInputStream fs;
	FileOutputStream fo;
	File src;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	Read_Write() throws Exception
	{
		src=new File("C:\\Users\\User\\Desktop\\MyExcel\\testing.xlsx");
		fs=new FileInputStream(src);
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheetAt(0);
	}
	
	void read() throws Exception
	{
		for(int i=0; i<=sh.getLastRowNum(); i++)
		{
			XSSFCell c=sh.getRow(i).getCell(1);
			String data=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Data is " +data);
			fs.close();
		}
	}
	
	void write() throws Exception
	{
		sh.getRow(0).createCell(3).setCellValue("Ashwini");
		sh.getRow(1).createCell(3).setCellValue("Khairul");
		fo=new FileOutputStream(src);
		wb.write(fo);
		System.out.println("Data inserteted successfully");
		wb.close();
	}
	

	public static void main(String[] args) throws Exception
	{
		Read_Write obj=new Read_Write();
		//obj.Read_Write();
		obj.read();
		obj.write();

	}

}
