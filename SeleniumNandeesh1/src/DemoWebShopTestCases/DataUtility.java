package DemoWebShopTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
	
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumNandeesh\\test.properties");
		Properties pob = new Properties();
		pob.load(fis);
		return pob.getProperty(key);
	}
	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumNandeesh\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		return book.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

}
