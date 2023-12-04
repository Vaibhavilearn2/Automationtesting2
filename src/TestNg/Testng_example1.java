package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_example1 {
	@Test
	public void Tc1()
	{
		Reporter.log("running test1",true);
	}
	@Test
	public void Tc2()
	{
		Reporter.log("running test2",true);
	}
	@Test
	public void Tc3()
	{
		Reporter.log("running test3",true);
	}
}
