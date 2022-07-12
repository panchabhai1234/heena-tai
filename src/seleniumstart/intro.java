package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Heena\\eclipse-workspace\\selenium16mayheena\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();// slash daych ahe
		driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v3_ei_brand_em&gclid=EAIaIQobChMI07-nsvvj9wIVyZ1LBR10Pg3uEAAYASAAEgL9u_D_BwE/");

	}

}
