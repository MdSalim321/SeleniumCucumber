package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.*;


public class ExcelUtil {
	
	
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		
		String path = System.getProperty("user.dir") + "./TestData/DataSheet.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		//String data[][] = null;
		
//	String data = sh.getRow(1).getCell(1).getStringCellValue();
//	System.out.println(data);
		
		int rowNo = sh.getPhysicalNumberOfRows();
		int cellNo = sh.getRow(0).getLastCellNum();
		
	//	data = new String[rowNo-1][cellNo];
		
		System.out.println("Row number is: "+rowNo+ " & column number is: "+cellNo);
		
		
		for(int i =1; i< rowNo; i++)
		{
			for(int j=0; j< cellNo; j++)
			{
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
//				Cell cell = sh.getRow(i).getCell(j);
//				data[i-1][j] = cell.toString();
					
		}
	}
		
	
	}
}
