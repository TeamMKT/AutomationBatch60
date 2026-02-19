package ab60.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartAutosuggestion 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("table");
		Thread.sleep(4000);
		List<WebElement> list=	driver.findElements(By.xpath("//form/ul/li"));
		
		int count=	list.size();
		System.out.println(count);
		list.get(count-5).click();
		
		 Date d1=new Date();//constructor
         System.out.println(d1.getTime());
         
 Date d2=new Date(d1.getTime());////constructor
   System.out.println(d2);
   String dateformat1=                d2.toString();
  String month= dateformat1.substring(4, 7);
   System.out.println(month);
   String date=dateformat1.substring(8, 10);
   System.out.println(date);
   String year=dateformat1.substring(dateformat1.length()-4);
   System.out.println(year);
   String min= dateformat1.substring(14, 16);
   String hour = dateformat1.substring(11, 13);

   String second= dateformat1.substring(17, 19);


   String format2=date.concat(month).concat(year);
   System.out.println(format2);
   String format3=date.concat(" ").concat(month).concat(" ").concat(year).concat("H").concat(hour).concat("M").concat(min).concat("S").concat(second);
   System.out.println(format3);
		TakesScreenshot ts=		driver;//step 1
		File source= 	ts.getScreenshotAs(OutputType.FILE);//step 2
	//	File destination=new File("E:\\MKTProject\\AutomatioBatch55\\screenshotab60\\TestCase.png");
		File destination=new File("E:\\MKTProject\\AutomatioBatch55\\screenshotab60\\"+new FlipkartAutosuggestion().getClass() +format3+".png");

		//step 3
		
		//step 4
		FileHandler.copy(source, destination);
		FileUtils.copyFile(source, destination);
	}
}
