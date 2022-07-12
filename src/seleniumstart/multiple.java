package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple {
	public static void main1(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
			WebElement multiSelectElement = driver.findElement(By.name("cars"));
			
			Select ms= new Select(multiSelectElement);
			Thread.sleep(1000);
			
			System.out.println("multi select status"+ms.isMultiple());
			
			

	}

}
