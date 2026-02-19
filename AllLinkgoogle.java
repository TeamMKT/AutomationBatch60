package ab60.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllLinkgoogle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Environment:->"+args[0]);
		System.out.println("Author:->"+args[1]);

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.google.com/");
		List<WebElement> e1=	driver.findElements(By.tagName("a"));
		int count=	e1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement firstlink=		e1.get(i);
		String url=	firstlink.getDomAttribute("href");
		String text=	firstlink.getText();
System.out.println(url);
System.out.println(text);

		}
		
	}
}
