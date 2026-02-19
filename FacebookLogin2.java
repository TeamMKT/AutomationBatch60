package ab60.selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");	
	Thread.sleep(3000);
	WebElement e1=	driver.findElement(By.id("email"));
	
	int ht=	e1.getSize().getHeight();
	int w=	e1.getSize().getWidth();
	
	System.out.println(ht);
	System.out.println(w);

	
	}
}
