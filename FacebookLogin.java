package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");	
	Thread.sleep(3000);
	WebElement e1=	driver.findElement(By.id("email"));
	
	if(e1.isDisplayed() && e1.isEnabled())
	{
	e1.sendKeys("manish@grotechminds.com");
	e1.sendKeys(Keys.CONTROL+"a");
	}
	else
	{
		System.out.println("Sorry please try again");
	}
	Thread.sleep(2000);
	e1.sendKeys(Keys.CONTROL+"c");

	WebElement e2=	driver.findElement(By.id("pass"));
		e2.sendKeys(Keys.CONTROL+"v");
	//driver.findElement(By.name("login")).click();	
	driver.findElement(By.tagName("button")).click();	

	}
}
