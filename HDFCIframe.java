package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HDFCIframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		WebElement frameelement=	driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frameelement);
		
		
		WebElement e1=	driver.findElement(By.name("fldLoginUserId"));
			e1.sendKeys("Manish");
			
		driver.switchTo().defaultContent();	//in order move the control back to the parent

	}
}
