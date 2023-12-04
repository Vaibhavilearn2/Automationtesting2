package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainpagefromChildBrowser {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("NewTab")).click();
		//get childWindowID
				//Set<String> allIds = driver.getWindowHandles();     //[mainPageId, childWindowID]
				//ArrayList<String> al=new ArrayList<>(allIds);
		Set<String>allIds = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(allIds);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//header/ul[@id='primary-menu']/li[7]/a[1]/span[1]/span[1]")).click();
		
	  Thread.sleep(2000);
	  driver.switchTo().window(al.get(0));
	  driver.findElement(By.name("NewTab")).click();
	}

}
