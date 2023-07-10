package web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_using_for_loop {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//header row using for loop
	for (int i=1; i<=3;i++)
	{
		WebElement header = driver.findElement(By.xpath("(//table[@id='table1']//tr[1]/th["+i+"])"));
		System.out.println(header.getText()+" ");
	}
	System.out.println();
	System.out.println("==============================");
	//to read single row using for loop
	
	for (int j=1;j<=3;j++)
	{
		WebElement row1 = driver.findElement(By.xpath("//table[@id='table1']//tr[1]/td["+j+"]"));
		System.out.println(row1.getText()+" ");
	}
	System.out.println();
	System.out.println("==============================");
	//to read all rows
	//outer loop for row
	for (int i=1;i<=4;i++)
	{
		for (int j=1;j<=3;j++)
		{
			WebElement fulltable = driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]/td["+j+"]"));
			System.out.println(fulltable.getText()+ " || ");
		}
		System.out.println();
	}
	}
	}
