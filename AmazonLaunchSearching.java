package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLaunchSearching 
{
	public static void main(String[] args) throws InterruptedException 
	{

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);	
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor js=			driver;
		js.executeScript("arguments[0].value='Shoes'", e1);

	}
}
