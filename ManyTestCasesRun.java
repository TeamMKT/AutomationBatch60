package ab60testng;
import org.testng.annotations.Test;
public class ManyTestCasesRun 
{
	@Test(invocationCount=5)
	public void login()
	{

	}
	@Test(enabled=false)
	public void logout()
	{
		
	}
	@Test(enabled=false)
	public void registration()
	{
		
	}
}
