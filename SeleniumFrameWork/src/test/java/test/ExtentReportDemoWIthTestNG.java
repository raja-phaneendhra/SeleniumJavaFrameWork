package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemoWIthTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver =null;


	@BeforeSuite
	public void setUp()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		

	}
	
	@BeforeTest
	public void TestSetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@Test
	public void Test1() throws IOException
	{
		
		ExtentTest test = extent.createTest("Google Search test one", "This is to validate the test");
		
		driver.get("https://google.com");
		test.pass("Navigated to the Google home page");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void Test2() throws IOException
	{
		ExtentTest test = extent.createTest("Google Search test one", "This is to validate the test");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");

	}
	
	@AfterTest
	public void TearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("The test completed successfully");
	}
	
	@AfterSuite
	public void TearDown()
	{
		
		extent.flush();
	}

}
