package ab60.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasewith2Body 
{
	@BeforeMethod
	public void launch()
	{
		System.out.println("browser launch");
	}
	@AfterMethod
	public void quit()
	{
		System.out.println("browser quit");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Test case 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Test case 2");
	}
}
