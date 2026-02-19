package ab60.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingOutTheBrokenLinks
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");
		List<WebElement> e1=	driver.findElements(By.tagName("a"));
		int count=	e1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement firstlink=		e1.get(i);
			String url=	firstlink.getDomAttribute("href");
			System.out.println(url);
			verifyTheLinks(url);
	
		}
	}
	static void verifyTheLinks(String u2) throws IOException
	{
		try
		{
		URL u1=new URL(u2);
		HttpURLConnection h1=	(HttpURLConnection) u1.openConnection();
		
			if(h1.getResponseCode()==200)
			{
				System.out.println("it is a valid links "+"The response message is ->"+ h1.getResponseMessage() +"The response code is ->"+h1.getResponseCode());
			}
			else
			{
				System.out.println("it is a broken links "+"The response message is ->"+ h1.getResponseMessage()+"The response code is ->"+h1.getResponseCode());
			}
		}
		catch(MalformedURLException m1)
		{
			System.out.println("hanlded the exception");
		}
		
		
	}
	
}
