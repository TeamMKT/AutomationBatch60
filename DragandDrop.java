package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=	driver.findElement(By.id("container-3"));
		WebElement drop=	driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}
