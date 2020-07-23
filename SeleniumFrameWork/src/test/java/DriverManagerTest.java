import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Google investments in India");
		List<WebElement> ListOfInputElements= driver.findElements(By.xpath("//input"));
		int count = ListOfInputElements.size();
		System.out.println(count);
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();
	}

}
