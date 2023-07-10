package new_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Option2");
	}
}
