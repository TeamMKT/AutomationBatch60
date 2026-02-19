package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMPPage2 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		Thread.sleep(2000);	
		WebElement e1=	driver.findElement(By.xpath("(//input)[1]"));
		e1.sendKeys("manish12345ty");
		WebElement e2=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e2.click();
		Thread.sleep(2000);	
		WebElement e3=	driver.findElement(By.xpath("//a"));
		e3.click();
		
		WebElement e4=	driver.findElement(By.xpath("//select"));
		
		Select s1=new Select(e4);
		s1.selectByIndex(2);

		
	}
}
