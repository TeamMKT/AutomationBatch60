package ab60.selenium;//button[text()='Accept All']

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AiIndia_ShadowRoot 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement e1=		driver.findElement(By.xpath("//button[text()='Accept All']"));
		e1.click();
		String path="return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
		//JavascriptExecutor js=	driver;
		//	js.executeScript(path);
		WebElement oneway=	(WebElement) driver.executeScript(path);
		Thread.sleep(3000);
		oneway.click();
		}
		
	}

