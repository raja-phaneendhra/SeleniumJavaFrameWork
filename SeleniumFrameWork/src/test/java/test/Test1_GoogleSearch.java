package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		GoogleSearch();
	

	}
	public static void GoogleSearch() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement textBox= driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Testing");
		textBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
