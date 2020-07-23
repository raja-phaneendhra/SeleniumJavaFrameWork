package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textBox_search_Google = By.name("q");
	
	By button_Search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) 
	{
		this.driver= driver;
	}
	
	public void SetTextInSearch(String text)
	{
		driver.findElement(textBox_search_Google).sendKeys(text);
	}
	
	public void ClickSearchButton()
	{
		driver.findElement(textBox_search_Google).sendKeys(Keys.RETURN);
	}
	
}
