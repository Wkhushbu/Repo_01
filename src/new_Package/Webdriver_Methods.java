package new_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get("https://vctcpune.com/");
		String Title= driver.getTitle();
		System.out.println("Title is " +Title);
		System.out.println("---------------------------");
		driver.navigate().to("https://www.google.co.in");
		String URL= driver.getCurrentUrl();
		System.out.println("Current URL is " +URL);
	}

}
