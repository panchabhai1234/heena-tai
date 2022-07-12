package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement select = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
select.click();
Thread.sleep(2000);
WebElement select1 = driver.findElement(By.name("firstname"));
select1.sendKeys("HEENA");
Thread.sleep(2000);
WebElement select2 = driver.findElement(By.name("lastname"));
Thread.sleep(2000);
	
select2.sendKeys("PANCHBHAI");
Thread.sleep(2000);
WebElement select3=driver.findElement(By.name("reg_email__"));
select3.sendKeys("hpanchbhai@gmail.com");
Thread.sleep(2000);
WebElement select4 = driver.findElement(By.name("reg_passwd__"));
select4.sendKeys("heena789");
Thread.sleep(2000);
WebElement select5 = driver.findElement(By.name("birthday_day"));
select5.sendKeys("7");
Thread.sleep(2000);
WebElement select6 = driver.findElement(By.name("birthday_month"));
select6.sendKeys("jan");
Thread.sleep(2000);
WebElement select61 = driver.findElement(By.name("birthday_year"));
select61.sendKeys("1997");
Thread.sleep(2000);
WebElement select7 = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
select7.click();
Thread.sleep(2000);
WebElement select8 = driver.findElement(By.name("websubmit"));
select8.click();

	}
	}


