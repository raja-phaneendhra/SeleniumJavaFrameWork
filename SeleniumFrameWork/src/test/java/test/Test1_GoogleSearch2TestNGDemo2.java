package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch2TestNGDemo2 {

	static WebDriver driver = null;
	
	@BeforeTest
	
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void GoogleSearch2() throws InterruptedException 
	{
		driver.get("https://google.com");
		
		WebElement textBox= driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Testing");
		textBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public static void GoogleSearch3() throws InterruptedException 
	{
		driver.get("https://google.com");
		
		WebElement textBox= driver.findElement(By.name("q"));
		textBox.sendKeys("Selenium Testing");
		textBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		
	}
	
	@Test
	public static void GoogleSearch4() throws InterruptedException 
	{
		driver.get("https://google.com");
		
		WebElement textBox= driver.findElement(By.name("q"));
		textBox.sendKeys("API Testing");
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
	}
}
