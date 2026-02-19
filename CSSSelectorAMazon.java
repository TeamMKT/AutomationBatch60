package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorAMazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'][placeholder='Search Amazon.in']"));
		e1.sendKeys("Shoe");


	}
}
