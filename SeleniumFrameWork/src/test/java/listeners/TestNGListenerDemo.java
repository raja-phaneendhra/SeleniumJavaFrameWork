package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo {

@Test(priority=2)
public void test1()
{
	System.out.println("I am inside test1");
}
	@Test(priority=3)
public void test2()
{
	System.out.println("I am inside test2");
	//AssertJUnit.assertTrue(false);
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://google.com");
	//driver.findElement(By.name("qsda")).sendKeys("Automation");
	driver.close();
	
}
	@Test(priority=1)
public void test3()
{
	System.out.println("I am inside test3");
}
	
	
}
