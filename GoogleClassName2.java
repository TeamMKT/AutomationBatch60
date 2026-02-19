package ab60.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleClassName2 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);	
		WebElement e1=	driver.findElement(By.linkText("Gmail"));
		e1.click();
		

		
	}
}
