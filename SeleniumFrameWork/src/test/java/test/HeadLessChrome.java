package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessChrome {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Google");
		String title= driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
