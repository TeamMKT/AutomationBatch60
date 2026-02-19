package ab60.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("Modi");
		Thread.sleep(5000);
		List<WebElement> list=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count=	list.size();
		System.out.println(count);
		list.get(count-6).click();
		
		
	}
}
