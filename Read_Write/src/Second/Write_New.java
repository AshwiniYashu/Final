package Second;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_New {

	public static void main(String[] args) throws Exception 
	{
		File src =new File("C:\\Users\\User\\Desktop\\MyExcel\\shape.xlsx");
		FileInputStream fs=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh= wb.getSheetAt(0);
		
		sh.getRow(0).createCell(3).setCellValue("Ashwini");
		sh.getRow(1).createCell(3).setCellValue("Ayushma");
	    FileOutputStream fo=new FileOutputStream(src);
	    wb.write(fo);
	    wb.close();
	    System.out.println("Data inseted successfully");
	    
	}

}
