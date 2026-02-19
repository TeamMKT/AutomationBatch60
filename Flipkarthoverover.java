package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkarthoverover 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1=	driver.findElement(By.xpath("//span[text()='Fashion']"));
		Thread.sleep(2000);

		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e3=	driver.findElement(By.linkText("Men's T-Shirts"));
		e3.click();
	}
}
