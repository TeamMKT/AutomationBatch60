package ab60.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class naurkiApplication 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.xpath("//span[text()='Google']"));
		e1.click();
		
		Set<String> ids=	driver.getWindowHandles();
		Iterator<String> pcid=			ids.iterator();
		String parentid=			pcid.next();
		String childid=			pcid.next();
		driver.switchTo().window(childid);
		
		Thread.sleep(4000);
		driver.close();
		
		
	}
}
