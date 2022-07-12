package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchmobile {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.amazon.in/");
 Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		Thread.sleep(1000);
		
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  Thread.sleep(20000);
 
  
	}

	
	}


