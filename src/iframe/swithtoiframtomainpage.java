package iframe;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class swithtoiframtomainpage {
		public static void main (String [] args) throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(3000);
			// iframe switch to mainframe 2 ways
			driver.switchTo().parentFrame();
			//driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		}

	}

