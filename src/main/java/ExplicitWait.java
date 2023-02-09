import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Timeout;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddr");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		boolean status = element.isDisplayed();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
		
		
		if(status)
			System.out.println("Element is displayed");
		
		else
			System.out.println("Element no present");

	}

}
