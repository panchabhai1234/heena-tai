package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

	System.getProperty("chromeDriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
	driver.get("https://vctcpune.com/selenium/practice.html#skills");
	 Thread.sleep(2000);
	 WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
	 checkbox.click();
	 
	 Thread.sleep(2000);
	if(checkbox.isSelected());
	{
		System.out.println("checkbox is dispalayed");
	}
	
	
	{
		System.out.println("CheckBox is now selected");
	}
	}

}
