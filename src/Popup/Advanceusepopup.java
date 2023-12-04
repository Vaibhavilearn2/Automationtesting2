package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanceusepopup {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert Box')]")).click();
		Alert altr= driver.switchTo().alert();
		String text = altr.getText();
		System.out.println(text);  //Confirm pop up with OK and Cancel button text read
		altr.accept();       // ok 
	}

}
