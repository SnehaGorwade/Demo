package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
public static void main(String[] args) {
		

		//WebDriver driver;

		//Setting system properties of ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();

		//to maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		//driver.get("https://www.flipkart.com/clothing-and-accessories/~cs-aerg0b0afc/pr?sid=clo&collection-tab-name=KK%2CSets%2CDM%2CSarees&fm=neo%2Fmerchandising&iid=M_f113f46a-aa7b-4b73-afa8-58d5bf8c532b_1_372UD5BXDFYS_MC.HQXTE43PO8HC&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion~Women%2BEthnic_HQXTE43PO8HC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&cid=HQXTE43PO8HC");
		
		
		
		//By link text
		//driver.findElement(By.linkText("Women Printed Viscose Rayon Anarkali Kurta")).click();
		driver.findElement(By.partialLinkText("Viscose Rayon Anarkali Kurta")).click();
		
		//Close the browser
		//driver.close();
		}

}
