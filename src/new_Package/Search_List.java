package new_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_List {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Java");
		Thread.sleep(2000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
		for (WebElement sr:searchResult)
		{
		System.out.println(sr.getText());	
		}
		for (WebElement sr : searchResult)
		{
			String expectedResult = "Java";
			if (expectedResult.equals(sr.getText()))
			{
				sr.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//span[text()='java'])[4]")).click();
		}
		
}
