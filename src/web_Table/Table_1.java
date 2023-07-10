package web_Table;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement Print = driver.findElement(By.xpath("(//table[@id='table1']//tbody/tr)[1]"));
		System.out.println(Print.getText());
		
		//To read header row
		List<WebElement> th_row = driver.findElements(By.tagName("th"));
		Iterator<WebElement> it= th_row.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next().getText() + "    ");
		}
		System.out.println();

	}

}
