package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement Amount_value1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement Amount_Field1 = driver.findElement(By.id("amt7"));
		//scroll into view amount field
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Amount_Field1);
		
		//create object of action class to use drag and drop
		Actions act = new Actions(driver);
		
		//drag and drop using inbuilt method
		act.dragAndDrop(Amount_value1, Amount_Field1).perform();
		
		WebElement Amount_Field2 = driver.findElement(By.id("amt8"));
		
		//drag and drop using old ways
		act.clickAndHold(Amount_value1).moveToElement(Amount_Field2).release().build().perform();
	}

}
