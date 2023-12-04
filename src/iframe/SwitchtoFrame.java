package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame {
	public static void main (String [] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		// mainframe to i frame switch 4 ways
		driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	//	driver.switchTo().frame();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}
}
