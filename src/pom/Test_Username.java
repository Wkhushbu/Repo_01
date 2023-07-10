package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common_Methods.Common_Methods;

public class Test_Username {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		Common_Methods.impliciWait(driver, 900);
		
		//create object of Login page
		Login_Page L = new Login_Page(driver);
		L.clickonSigninButton();
		Thread.sleep(1000);
		L.EnterMobileNumber();
		L.clickonSigninButton();

	}

}
