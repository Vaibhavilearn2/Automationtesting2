package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_enabled {
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}

}
