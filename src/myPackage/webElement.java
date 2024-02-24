package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {
public static void main(String[] args) throws InterruptedException {
		

		//WebDriver driver;

		//Setting system properties of ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
          
		//launching the specified URL 
		driver.get("https://dev2.xirify.com/");
		//Maximize
		driver.manage().window().maximize();
		//enter the UN
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mainAdmin");
		//enter pwd
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mainAdmin");
		//Click on login
		//driver.findElement(By.className("MuiButton-label")).click();
		
		//Clear the UN & PWD
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).clear();
		//Thread.sleep(4000);
		//driver.findElement(By.id("password")).clear();
		//submit
		//driver.findElement(By.id("username")).submit();
}

}
