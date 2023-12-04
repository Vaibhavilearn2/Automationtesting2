package TestNg;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword1_invocationcount {
	@Test(invocationCount=3)
	public void TC1()
	{
		Reporter.log("running Tc1",true);
	}

}
