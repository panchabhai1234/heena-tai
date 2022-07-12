package seleniumstart;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe"));
		
           // WebDriver driver= new ChromeDriver();
        //driver.get("https://www.facebook.com/");
              //driver.findElement(By.xpath("//label[@for='Radio2']")).click();
              ///driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello velocity");
              //driver.findElement(By.xpath("//input[type()='text']")).sendKeys("heena.panchbhai");
           
		//driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).click();// for text
        //driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
       /*driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("heenpanchbhai");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
       driver.close();
       driver.quit();*/
		
		//19 may lecture
		//driver.manage().window().maximize(); 
        //read.sleep(1000);//giving some time to open application
       // driver.get("https://vctcpune.com/selenium/practice.html");
        //Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//a[text()='Velocity  Corporate Training Center']")).getText());
        //2.
        //String text = driver.findElement(By.xpath("//a[text()='Velocity Corporate  Training Center']")).getText();
        //System.out.println(text);
          //3.
        //WebElement element = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
        //System.out.println(element.getText());
       //==========================================================================
          // 23/05 lecture
              WebDriver driver= new ChromeDriver();
      // driver.get("https://vctcpune.com/selenium/practice.html");
        //driver.manage().window().maximize();
          driver.get("https://www.discoveryplus.in/");
          Thread.sleep(5000);
          driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
          Thread.sleep(1000);
          WebElement getOTPButton = 
          driver.findElement(By.xpath("//button[text()='Get OTP']"));
          System.out.println(getOTPButton.isEnabled());
          driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
          Thread.sleep(1000);
          System.out.println(getOTPButton.isEnabled());
          getOTPButton.click();


          
          
	}
	}


