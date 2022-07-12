package seleniumPractice;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome",("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest=new File("C:\\Users\\Heena\\eclipse-workspace\\sscc.png");
		FileHandler.copy(source, dest);
	}

}
