package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement about=	driver.findElement(By.tagName("a"));
		about.click();
		//about.sendKeys(Keys.ENTER);
	}
}
