package ab60.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);	
		WebElement e1=	driver.findElement(By.name("file"));
		e1.sendKeys("C:\\Users\\MKT\\Downloads\\excelsheet.xlsx");
	}
}
