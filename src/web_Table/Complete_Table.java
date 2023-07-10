package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete_Table {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement table1 = driver.findElement(By.xpath("(//table[@id='table1'])"));
		System.out.println(table1.getText());

	}

}
