package excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 FileInputStream myFile = new FileInputStream("D:\\Software Testing\\Automation\\Excel Sheet\\Test.xlsx");
	 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	 Cell mycell = mysheet.getRow(0).getCell(0);
	 System.out.println(mycell);
	}

}
