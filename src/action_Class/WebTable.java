package action_Class;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		//To read First row
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='table1'//tr[1]/td"));
		Iterator<WebElement> it1=row1.iterator();
		while (it1.hasNext())
		{
			System.out.print(it1.next().getText()+ "  ");
		}
		System.out.println();
		
		
	}

}
