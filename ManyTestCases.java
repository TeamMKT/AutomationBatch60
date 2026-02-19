package ab60testng;
import org.testng.annotations.Test;

public class ManyTestCases 
{
	@Test(groups= {"system"})
	public void testcase7() 
	{
		System.out.println("Test case 7");
		
	}
		@Test(groups= {"smoke","system"})
		public void testcase1() 
		{
			System.out.println("Test case 1");
			
		}
		@Test(groups= {"integration"})
		public void testcase2()
		{
			System.out.println("Test case 2");
			
		}
		@Test(groups= {"smoke"})
		public void testcase3() 
		{
			System.out.println("Test case 3");
			
		}
		@Test(groups= {"smoke"})
		public void testcase4() 
		{
			System.out.println("Test case 4");
			
		}
		@Test(groups= {"integration"})
		public void testcase5() 
		{
			System.out.println("Test case 5");
			
		}
		@Test(groups= {"integration"})
		public void testcase6() 
		{
			System.out.println("Test case 6");
			
		}
}
