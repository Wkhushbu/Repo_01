package common_Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Common_Methods 
{
	//wait
	public static void impliciWait(WebDriver driver, long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
	//Screenshot
	public static void captureScreenshot(WebDriver driver, String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Software Testing\\Screenshot Selenium\\" +fileName+ ".png");
		FileHandler.copy(src, destination);
	}
	//scrolling
	public static void scrollIntoView(WebDriver driver, WebElement Element)
	{
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true)", Element);
	}
	//read from excel
	public static String readDataFromExcel(int rowNum, int cellNum) throws EncryptedDocumentException, IOException, FileNotFoundException
	{
		FileInputStream myFile = new FileInputStream("D:\\Software Testing\\Automation\\Excel Sheet\\Test.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println(value);
		return value;
	}

		

}
