package ab60.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GoogleClassName 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(NullPointerException.class);
		wait.until(ExpectedConditions.titleIs("Google"));
		
		
		WebElement e1=	driver.findElement(By.linkText("Gmail"));
		e1.click();
	/*	Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);	

		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);	

		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);	
		r1.keyPress(KeyEvent.VK_ENTER);
*/
		
	}
}
