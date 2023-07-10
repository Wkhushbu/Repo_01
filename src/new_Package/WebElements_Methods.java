package new_Package;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class WebElements_Methods 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver = new ChromeDriver();
	//driver.get("https://paytm.com/recharge");
	//driver.manage().window().maximize();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8109164663");
	//driver.findElement(By.xpath("//span[text()='Operator']")).click();
	//WebElement operator = driver.findElement(By.xpath("//span[text()='BSNL']"));
	//operator.click();
	
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); // navigate
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@value='radio2']")).click(); // radio button
	Thread.sleep(1000);
	
	driver.findElement(By.id("autocomplete")).sendKeys("China");
	Thread.sleep(1000);
	
	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));//drop down
	Select s = new Select(dropdown);
	s.selectByVisibleText("Option3");
	
	//driver.findElement(By.cssSelector("button#openwindow")).click(); //click()
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //screenshot
	System.out.println(source);
	String str = RandomString.make(3);
	File dest = new File("C:\\Screenshot\\image1"+str+" .png");
	org.openqa.selenium.io.FileHandler.copy(source, dest);
	
	driver.findElement(By.id("checkBoxOption2")).click(); //Locators - id
	//driver.findElement(By.partialLinkText("Open")).click(); // Locators - Partial link text
	driver.findElement(By.cssSelector("button.btn")).click(); // Locators - CSS selector by tag.class
	Thread.sleep(1000);
	//driver.quit();
	
	
	}
}
