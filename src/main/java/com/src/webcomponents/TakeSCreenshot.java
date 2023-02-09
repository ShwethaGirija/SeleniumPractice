package com.src.webcomponents;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSCreenshot {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("Shwetha");
		
		File src = element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("screenshot.jpg"));
		
		element.sendKeys(Keys.ENTER);
		
		

	}

}
