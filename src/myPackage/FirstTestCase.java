package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		

		//WebDriver driver;

		//Setting system properties of ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();

		//to maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.facebook.com/");
		
		//By id
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		
		//By name
		//driver.findElement(By.name("field-keywords")).sendKeys("drink");
		
		//By link text
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Close the browser
		//driver.close();
		}
}
