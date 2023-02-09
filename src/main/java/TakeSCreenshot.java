import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TakeSCreenshot {

	public static void main(String[] args) {
		
WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("Shwetha");
		
		File src = element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("screenshot.jpg"));
		
		element.sendKeys(Keys.ENTER);
		
		

	}

}
