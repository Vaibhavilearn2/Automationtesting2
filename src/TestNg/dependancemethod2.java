package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependancemethod2 {
	@Test
	public void tc1()
	{
		Reporter.log("login test TC1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("login test TC2",true);
	}
	@Test(dependsOnMethods={"tc1","tc2"})
	public void tc3()
	{
		Reporter.log("logout test TC3",true);
	}

}
