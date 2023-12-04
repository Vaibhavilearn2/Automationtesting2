package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anotation_Testng {

	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("--open Browser--",true);
	}
	@BeforeMethod
	public void loginApp()
	{
		Reporter.log("--login to app--",true);
		
	}
	@Test
	public void verifyfullname()
	{
		Reporter.log("--running verifyfullname test case--",true);
		
	}
	@Test
	public void verifyfullname2()
	{
		Reporter.log("--running verifyfullname test2 case--",true);
		
	
}
	@AfterMethod
		public void logoutfromApp()
		{
		Reporter.log("--logout from App--",true);	
		}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("--close Browser--",true);
	}
	
	}
