package First;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void main(String[] args) throws Exception
	{
		File src=new File("C:\\Users\\User\\Desktop\\MyExcel\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println("Your data is:");
		int count=0;
		for(int i=1;i<=sh.getLastRowNum(); i++)
		{
		XSSFCell c=sh.getRow(i).getCell(1);
		String data=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data);
		fs.close();

	}

}
}
