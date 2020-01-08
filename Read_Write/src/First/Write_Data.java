package First;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws Exception 
	{
		File src=new File("C:\\Users\\User\\Desktop\\Book2.xlsx");
		FileInputStream f = new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Excel");

		String message = "Successfully imported";

		sh.getRow(0).createCell(2).setCellValue(message);
		sh.getRow(1).createCell(2).setCellValue("Ashwini");
		sh.getRow(2).createCell(2).setCellValue("Varsha");
		sh.getRow(3).createCell(2).setCellValue("Ayushma");
		FileOutputStream fileOutput = new FileOutputStream(src);
		wb.write(fileOutput);
		wb.close();
		System.out.println("data inserted");

	}

}
