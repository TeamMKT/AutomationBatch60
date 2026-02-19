package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonHoverover 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.linkText("Instagram"));
		Point p1=	e1.getLocation();
		int x=	p1.getX();
		int y=	p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js=	driver;
		js.executeScript("window.scrollBy(0,"+y+")");
	//	Thread.sleep(3000);
	//	js.executeScript("window.scrollBy(0,"+(-y)+")");
		
	//	js.executeScript("window.scrollBy(0,100)", e1);


	}
}
