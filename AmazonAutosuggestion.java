package ab60.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toy");
		Thread.sleep(5000);
		List<WebElement> list=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int count=	list.size();
		System.out.println(count);
		list.get(count-10).click();
		
		
	}
}
