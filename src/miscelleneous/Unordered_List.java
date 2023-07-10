package miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unordered_List {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Snapdeal");
		Thread.sleep(1000);
		
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
		for (WebElement sr:searchresult)
		{
			System.out.println(sr.getText());
		}
		for (WebElement sr: searchresult)
		{
			String ExpectedResult = "Snapdeal Login";
		if (ExpectedResult.equals(sr.getText())) 
		{
			sr.click();
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//div[@id='Zrbbw']")).click();
		}
		
		driver.findElement(By.xpath("//h3[text()='Login or Register at Snapdeal']")).click();
		driver.findElement(By.xpath("(//span[text()='Google'])[1]")).click();
		
		
	}

}
