package DemoWebShopTestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumNandeesh\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row row=sh.getRow(2);
		Cell cell=row.getCell(0);
		//String value=cell.getStringCellValue();
		//double value = cell.getNumericCellValue();
		String value = cell.toString();
		System.out.println(value);
		
		//sh.getRow(0).getCell(0).toString();
		
	}

}
