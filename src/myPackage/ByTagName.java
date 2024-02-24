package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {
	public static void main(String[] args) {
		

		//WebDriver driver;

		//Setting system properties of ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehag\\Desktop\\Slenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();

		//launching the specified URL 
		driver.get("https://google.com/");
		
		//By tag name
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		//name of links
		for (WebElement l:link)
		{
			System.out.println(l.getText());
		}
		//Close the browser
		//driver.close();
		}

}
