package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleCLick 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("firstName"));
		e1.sendKeys("manish");
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();
		Thread.sleep(2000);

		a1.contextClick(e1).perform();

		
	}
}
