package web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_Loop_Table {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		for(int i=1;i<=26;i++)
		{
		//inner for loop to vary column td-->1-5
		for(int j=1;j<=5;j++)
		{
		WebElement datanew = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));

		System.out.print(datanew.getText()+" || ");
		}
		System.out.println();

	}
	}}
