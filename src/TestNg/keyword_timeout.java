package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_timeout {
	@Test(timeOut=2000)
	public void Tc1() throws InterruptedException
	{
		Thread.sleep(8000);
		Reporter.log("running TC1",true);
		
	}

}
