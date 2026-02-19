package ab60.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAllAnnotations2 
{
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}@Test
	public void Testcase()
	{
		System.out.println("Test Case");

	}
	@AfterSuite
	public void as()
	{
		System.out.println("After SUite");

	}
	@AfterMethod
	public void am()
	{
		System.out.println("Aftwr method");

	}
}
