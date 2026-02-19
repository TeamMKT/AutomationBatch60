package ab60testng;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCases 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
}
