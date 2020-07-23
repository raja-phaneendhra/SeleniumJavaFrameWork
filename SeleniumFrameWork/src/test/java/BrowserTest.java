import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path :"+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome/chromedriver 2");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}

}
