package ab60;

public class TestCase1_LoginToAmazon extends Test_BaseClass
{
	static void login()
	{
		System.out.println("Login to amazon");
	}
	public static void main(String[] args) 
	{
		launchBrowser();
		login();
		quitBrowser();
		
		
	}
}
