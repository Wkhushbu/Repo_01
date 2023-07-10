package pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(xpath = "//a[text()='Sign in']") private WebElement signInbutton;
	@FindBy(xpath = "(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobileNumber;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signinwithpassword;
	
	//Constructor
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void clickonSigninButton()
	{
		signInbutton.click();
	}
	public void EnterMobileNumber()
	{
		mobileNumber.sendKeys("8109164663");
	}
	public void ClickonSigninwithPassword()
	{
		signinwithpassword.click();
	}
	
	
}
