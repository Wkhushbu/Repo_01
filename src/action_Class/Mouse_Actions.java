package action_Class;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://vctcpune.com/selenium/practice.html");
	
	//create object of Actions class and pass driver object as parameter
	Actions AC = new Actions(driver);
	
	//find element to be act
	//WebElement closebutton = driver.findElement(By.xpath("//button[@data-testid='close-button']"));
	//closebutton.click();
	
	//Now take action and perform
	//aboutus.click();
	//AC.click(closebutton).perform();
	
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));
	AC.moveToElement(rightclickme).contextClick().build().perform();
	
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	AC.moveToElement(doubleclick).doubleClick().build().perform();
	}

}
