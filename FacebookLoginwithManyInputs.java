package ab60.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginwithManyInputs 
{
	@DataProvider
	public Object[][] logindata()
	{
		Object [][]d1=new Object[5][2];
		//row 1
		d1[0][0]="+918009900785";//valid username as mobile no
		d1[0][1]="mansih1234e";//valid password
		
		//row 2
		d1[1][0]="contact@grotechminds.com";//valid username as email id no
		d1[1][1]="mansih1234e";//valid password
		
		//row 3
				d1[2][0]="contact@grotechminds.com";//valid username as 
				d1[2][1]="456tyhgfdertg";//invalid password
				
				//row 4
				d1[3][0]="mansih@gmail";//valid username as mobile no
				d1[3][1]="er4t5ghytgfertgh";//valid password		
		
				//row 5
				d1[4][0]="";//null
				d1[4][1]="";//null
		return d1;
		
	}
	
	@Test(dataProvider="logindata")
	public void loginWIthvalidAndINvalid(String username,String password ) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement e1=	driver.findElement(By.id("email"));
	e1.sendKeys(username);
	WebElement e2=	driver.findElement(By.id("pass"));
		e2.sendKeys(password);
	//driver.findElement(By.name("login")).click();	
	WebElement e3=	driver.findElement(By.tagName("button"));	
	e3.click();
	}
}
