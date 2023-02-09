import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariDriverBrowser {

	public static void main(String[] args) {
		
		//WebDriverManager.safaridriver().setup();
		
		//System.setProperty("webdriver.chrome", null)
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}

}
