import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromeBrowser {

	public static void main(String[] args) {
	

			//WebDriver driver;

			//Setting system properties of ChromeDriver 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			//Creating an object of ChromeDriver
			WebDriver driver = new ChromeDriver();

			//launching the specified URL 
			driver.get("https://google.com/");
			
			//Close the browser
			driver.close();
			}
	
	
	

}
