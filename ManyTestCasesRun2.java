package ab60testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ManyTestCasesRun2 
{
	@Test(timeOut=1000)
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();
	}
	
}
