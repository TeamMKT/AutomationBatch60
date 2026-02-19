package ab60testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialCount=0;
	int retryCount=2;//many times i want to re run my failed test case
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retryCount)
		{
			initialCount++;//initialCount=0,initialCount=
			return true;//re run the failed test case
		}
		
		return false;//false->dont retry at all
		//return true->retry inifinite times
	}
	
}
