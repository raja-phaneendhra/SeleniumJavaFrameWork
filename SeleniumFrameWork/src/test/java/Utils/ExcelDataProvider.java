package Utils;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.propertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	static WebDriver driver= null;
	
@BeforeTest
	
	public void SetUp() throws FileNotFoundException
	{
		propertiesFile.getProperties();
	
		
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
	
	}
	
	@Test(dataProvider = "testData")
	public void test1(String userName, String Password) throws InterruptedException
	{
		System.out.println(userName+ " | "+ Password);
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
//		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
//		driver.findElement(By.id("login-username")).sendKeys(userName);
//		driver.findElement(By.id("login-signin")).click();
//		driver.findElement(By.id("login-passwd")).sendKeys(Password);
//		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
		//String ActuaTitle= 
		
	}
	@DataProvider(name="testData")
	public Object getData()
	{
		String excelPath="/Users/Raja/eclipse-workspace/SeleniumFrameWork/excel/data.xlsx";
		Object data= testData(excelPath, "sheet2");
		return data;
	}
	public static Object testData(String excelPath, String sheetName)
	{
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount= excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount;i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String CellData= excel.getCellDataString(i, j);
				System.out.print( CellData +" | ");
				data[i-1][j] = CellData;
			}
			System.out.println();
		}
		return data;
	}
}
