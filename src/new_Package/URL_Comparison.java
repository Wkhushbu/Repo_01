package new_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Comparison {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://dev.java/learn/oop/");
	driver.manage().window().minimize();
	String ExpectedURL= "www.learn.java";
	String actualURL= driver.getCurrentUrl();
	
	System.out.println("Expected URL is " +ExpectedURL);
	System.out.println("Actual URL is " +actualURL);
	
	if (actualURL.equals(ExpectedURL))
	{
		System.out.println("Test is pass");
	}
	else
	{
		System.out.println("Test is fail");
	}
	}

}
