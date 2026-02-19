package ab60.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//	ChromeOptions options=new ChromeOptions();
	//	options.addArguments("headless");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		WebElement e1=	driver.findElement(By.id("searchDropdownBox"));
		e1.click();
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		e1.sendKeys(Keys.ENTER);
		
		System.out.println(driver.getTitle());

		
	}
}
