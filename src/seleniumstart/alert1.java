package seleniumstart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) throws InterruptedException {
		//1. Hidden-Division Popup
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("1plus 9pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//2.Alert popup*/
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
//To handle alert popup we need to switch selenium focus from main 
		//page to alert popup by using syntax
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
	}

}
