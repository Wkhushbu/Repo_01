package excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream myfile = new FileInputStream("D:\\Software Testing\\Automation\\Excel Sheet\\Test.xlsx");
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	int total_Rows = mySheet.getLastRowNum();
	int totalCells = mySheet.getRow(0).getLastCellNum()-1;
	
	//outer for loop - rows
	for (int i=0;i<=total_Rows;i++)
	{
		for (int j=0;j<=totalCells;j++)
		{
			Cell myCell = mySheet.getRow(i).getCell(j);
			CellType celltype = myCell.getCellType();
			if (celltype==CellType.STRING)
			{
				System.out.println(myCell.getStringCellValue()+" ");
			}
			else if (celltype==CellType.NUMERIC)
			{
				System.out.println(myCell.getNumericCellValue()+" ");
			}
			else if (celltype==CellType.BOOLEAN)
			{
				System.out.println(myCell.getBooleanCellValue()+" ");
			}
			else if (celltype==CellType.BLANK)
			{
				System.out.println("  ");
			}
			}
		System.out.println();
		}
	}

}
