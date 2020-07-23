package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	
	private static WebDriver driver= null;

	public static void main(String[] args) {
		
		GoogleSearchTest();
	}
	
	public static void GoogleSearchTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		
		obj.SetTextInSearch("Automation Testing");
		obj.ClickSearchButton();
		
		driver.close();
	}
	
}
