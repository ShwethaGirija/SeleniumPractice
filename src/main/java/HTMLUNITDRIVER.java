
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUNITDRIVER {

	public static void main(String[] args) {
		
	WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Shwetha",Keys.ENTER);
		
		System.out.println("GOOGLE SERACH OPENED");
		
		driver.quit();
		

	}

}
