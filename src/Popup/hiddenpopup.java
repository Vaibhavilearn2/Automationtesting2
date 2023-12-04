package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		// alter for flipkart 
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("car");
		// for alert ok accept
		// nxtgenaiacademy website # 1st alter popup
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		//driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[2]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/center[1]/button[1]")).click();
		//driver.switchTo().alert().accept();
		
		// nxtgenaiacademy website # 2nd alter popup
driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert Box')]")).click();

 // click on cancel button
driver.switchTo().alert().dismiss();
		
		
	}

}
