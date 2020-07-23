package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test = extent.createTest("Google Search tesst one", "This is to validate the test");
        
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test.log(Status.INFO, "Starting test case");
		
		driver.get("https://google.com");
		
		test.pass("Navigated to google.com ");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		test.pass("Entered text in search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.pass("Pressed Keyboard enter key");
		
		driver.close();
		driver.quit();
		
		test.pass("Closed the browser");
		test.info("Test completed");
		
		extent.flush();
		

	}

}
