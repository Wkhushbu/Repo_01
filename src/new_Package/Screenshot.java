package new_Package;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	String str = RandomString.make(3);
	File dest =new File("C:\\Screenshot" + str + ".png");
	org.openqa.selenium.io.FileHandler.copy(source, dest);
	}
}
