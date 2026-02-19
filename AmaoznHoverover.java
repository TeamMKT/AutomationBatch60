package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmaoznHoverover 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1=	driver.findElement(By.xpath("//span[text()='Prime']"));

		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e2=	driver.findElement(By.linkText("Join Prime"));
		e2.click();
		
	}
}
