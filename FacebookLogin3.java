package ab60.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin3 
{
	@Test
	public static void m2() throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com");	
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
/*	WebElement e1=	driver.findElement(By.xpath("//button"));
	
	String s1=		e1.getCssValue("color");
	String s2=		e1.getCssValue("background-color");
System.out.println(s1);
System.out.println(s2);
*/
	}
	@DataProvider
	public Object[][] m1()
	{
		Object[][] d1=new Object[2][2];
		return d1;
		
	}
	
	}

