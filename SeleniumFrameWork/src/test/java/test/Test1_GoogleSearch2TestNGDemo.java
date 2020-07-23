package test;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch2TestNGDemo {

	static WebDriver driver = null;
	public static String browserName= null;
	
	@BeforeTest
	
	public void SetUp() throws FileNotFoundException
	{
		propertiesFile.getProperties();
	
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
	
		
	}
	
	@Test
	public static void GoogleSearch() throws InterruptedException 
	{
		driver.get("https://google.com");
		
		WebElement textBox= driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Testing");
		textBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		
	}

	@AfterTest
	public void TearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");
		propertiesFile.SetProperties();
	}
}
