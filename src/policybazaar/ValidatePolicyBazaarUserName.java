package policybazaar;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import common_Methods.Common_Methods;

public class ValidatePolicyBazaarUserName {

	public static void main(String[] args) throws Exception 
	{
		//using chromeoptions for disabling notifications
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver =  new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		
		Common_Methods.impliciWait(driver, 900);
		
		// Click on Sign-in button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(1000);
		
		// Enter Mobile number
		String UserID = Common_Methods.readDataFromExcel(0, 0);
		
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(UserID);
		
		// Click on Sign in with password
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
				
		// Enter password
		driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys(Common_Methods.readDataFromExcel(0, 1));
		//Click on sign in button
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Common_Methods.impliciWait(driver, 900);
		
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
				
		//new window will open, we need to switch the focus to new window
		Set<String> allid = driver.getWindowHandles();
						
		//convert Set to List
		List<String> L = new ArrayList<String>(allid);
		String childPageID = L.get(1);
						
		//switch to child page
		driver.switchTo().window(childPageID);
		Thread.sleep(1000);
		
		String expectedResult = Common_Methods.readDataFromExcel(0, 2);
						
		String actualResult = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
						
		if (expectedResult.equals(actualResult))
		{
			System.out.println("Actual and Expected Results are matching - TC is passed");
		}
		else
		{
			System.out.println("Actual and Expected Results are not matching - TC is failed");
		}
		driver.quit();
		
	}

}
