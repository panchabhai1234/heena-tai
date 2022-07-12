package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("https://skpatro.github.io/demo/iframes/");
                driver.manage().window().minimize();
                Thread.sleep(3000);
              String text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
                System.out.println(text);
                
                driver.switchTo().frame( "Frame1");
                String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
                System.out.println(text1);
                
                driver.switchTo().parentFrame();
                String text2 = driver.findElement(By.linkText("Blogger")).getText();
                System.out.println(text2);
                
                driver.switchTo().frame( "Frame2");
                String text3 = driver.findElement(By.linkText("Category3")).getText();
                System.out.println(text3);
                
                driver.switchTo().defaultContent();
                
                String text4 = driver.findElement(By.linkText("Pavilion")).getText();
                System.out.println(text4);
                
                
                
	}

}
