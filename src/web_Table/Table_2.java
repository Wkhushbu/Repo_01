package web_Table;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement row = driver.findElement(By.xpath("(//table[@id='table1']//tbody/tr)[1]"));
		System.out.println(row.getText());
		
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
		Iterator<WebElement> it1 = row1.iterator();
		while (it1.hasNext())
		{
			System.out.println(it1.next().getText()+ "  ");
		}
	}

}
