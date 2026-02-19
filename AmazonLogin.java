package ab60.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskabkin-21%26ref%3Dnav_signin%26adgrpid%3D1317216540160148%26hvadid%3D82326299627209%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D116072%26hvtargid%3Dkwd-82326918609608%3Aloc-90%26hydadcr%3D5623_2377284%26mcid%3Df13fcffd1964377ea436bb8da9e6f147&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	
		
		WebElement un=	driver.findElement(By.name("email"));
		un.sendKeys("stbymkt@gmail.com");
		WebElement cnt=	driver.findElement(By.id("continue"));
		
		cnt.click();
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.id("signInSubmit")).click();

		
		
	}
}
