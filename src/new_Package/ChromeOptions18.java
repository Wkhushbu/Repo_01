package new_Package;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions18 {

	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		ArrayList<String> al = new ArrayList<>();
		al.add("start-maximized");
		al.add("disable-popup-blocking");
		al.add("incognito");
		al.add("disable-infobars");
		al.add("disable-extensions"); 
		
		opt.addArguments(al);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://in.sugarcosmetics.com/");
		
		

	}

}
