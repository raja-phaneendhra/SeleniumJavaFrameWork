package test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestSearch {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		GoogleSearch();
		driver.quit();
		
	}
	
	public static void GoogleSearch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		GoogleSearchPage.TextBox_Search(driver).sendKeys("Automation testing");
		GoogleSearchPage.Button(driver).sendKeys(Keys.ENTER);
	}
}
