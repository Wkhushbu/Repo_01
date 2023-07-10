package new_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Comparison 
{
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().minimize();
	String actualTitle= driver.getTitle();
	String ExpectedTitle= "Googgle";
	System.out.println("Actual Title is " +actualTitle);
	System.out.println("Expected Title is " +ExpectedTitle);
	
	if (actualTitle.equals(ExpectedTitle))
	{
		System.out.println("Title is same");
	}
	else
	{
		System.out.println("Title is not same");
	}
	}
}
