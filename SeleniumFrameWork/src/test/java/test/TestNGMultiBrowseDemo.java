package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowseDemo {

	WebDriver driver = null;


	@BeforeMethod
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{

		System.out.println("The browser Name is:" + browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}

	@Test
	public void Test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(2000);
	}

	@Test
	public void Test2() throws InterruptedException
	{
		driver.get("https://facebook.com");
		Thread.sleep(2000);
	}

	@AfterTest
	public void TearDown() 
	{
		driver.close();
		System.out.println("The Test completed successfully");
	}

}
