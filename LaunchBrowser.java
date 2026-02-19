llpackage ab60.selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");	
	
	Thread.sleep(2000);
	String title=		driver.getTitle();
	String parentid=		driver.getWindowHandle();
	Set<String> parentchildid=driver.getWindowHandles();
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	System.out.println(title);
	System.out.println(parentid);
	System.out.println(parentchildid);


	driver.quit();
		
	}
}
