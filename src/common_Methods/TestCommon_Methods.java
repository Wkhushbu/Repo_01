package common_Methods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCommon_Methods {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, FileNotFoundException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		Common_Methods.impliciWait(driver, 1000);

		WebElement cashback =driver.findElement(By.xpath("//div[text()='Pay anyone directly from your bank account.']"));
		
		Common_Methods.scrollIntoView(driver, cashback);
		
		Common_Methods.captureScreenshot(driver, "Paytm");
		
		String myvalue = Common_Methods.readDataFromExcel(0,0);
		System.out.println(myvalue);
	}
  
}
