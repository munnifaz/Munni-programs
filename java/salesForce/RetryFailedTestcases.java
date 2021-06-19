package testNG_Execution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcases implements IRetryAnalyzer {
	
	int retryCount=0;
	int maxRetry=3;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && retryCount<maxRetry) {
			retryCount++;
			return true;
		}
		return false;
	}

}
