package ab60.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSearchWIthManyInputs 
{
	@Test(dataProvider="searching")
	public void searchingProduct(String input) throws InterruptedException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider
	public Object[][] searching()
	{
		Object d1[][]=new Object[5][1];
		d1[0][0]="mouse";
		d1[1][0]="mobiles";
		d1[2][0]="tv";
		d1[3][0]="monitor";
		d1[4][0]="laptop";
		return d1;
		
	}
	@DataProvider
	public Object[][] login()
	{
		Object d1[][]=new Object[5][1];
		d1[0][0]="mouse";
		d1[1][0]="mobiles";
		d1[2][0]="tv";
		d1[3][0]="monitor";
		d1[4][0]="laptop";
		return d1;
		
	}
	
}
