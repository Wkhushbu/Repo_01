package action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}}
		
	//	WebElement day = driver.findElement(By.className("_9407 _5dba _9hk6 _8esg"));
		
		//create an object of Action class
		
		//Actions act = new Actions(driver);
		//act.click(day).perform();
		
//		//for (int i=1;i<=7;i++)
	//	{
	//		Thread.sleep(1000);
//			act.sendKeys(day, Keys.ARROW_UP).perform();
//		}
//		act.sendKeys(day, Keys.ENTER).perform();
//		day.sendKeys(Keys.HOME);
//	}

//}
