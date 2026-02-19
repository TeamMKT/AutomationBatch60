package ab60testng;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Three 
{
		
		@Test(retryAnalyzer=RetryLogic.class)
		public void testcase3() throws InterruptedException
		{
			EdgeDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			WebElement e1=	driver.findElement(By.id("123"));
//			WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));

			e1.sendKeys("t shirt"+Keys.ENTER);
			Thread.sleep(4000);
			List<WebElement> list=	driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
			WebElement list1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			//list1.click();
		list.get(9).click();
			Set<String> ids=	driver.getWindowHandles();
			System.out.println(ids);
			Thread.sleep(4000);
			driver.quit();
		}
}
