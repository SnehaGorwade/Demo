package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
public static void main(String[] args) throws InterruptedException {
		

		//WebDriver driver;

		//Setting system properties of ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//navigate to
		driver.navigate().to("https://www.amazon.in/");
				
		//Maximize
	    driver.manage().window().maximize();
          
		//navigate to
		driver.navigate().to("https://www.ebay.com/");
		
		//search 
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("mobile");
		
		//refresh
		driver.navigate().refresh();
		//Back
		Thread.sleep(2000);
		driver.navigate().back();
		//Forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//Close
		driver.close();

}
}