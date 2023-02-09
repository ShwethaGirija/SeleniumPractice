package com.src.automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.google.com");

				driver.findElement(By.name("q")).sendKeys("Testing");
				
			WebElement suggestionbox = driver.findElement(By.xpath("//div[@role='presentation']"));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='presentation']")));
			Thread.sleep(2000);
			List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]/div[1]/span"));
	
			System.out.println("No of suggestions is "+suggestions.size());
			
			for(WebElement temp:suggestions)
			{
				System.out.println(temp.getText());
				if(temp.getText().contains("testing tools"))
					{
					temp.click();
					break;
					}
					
			}
			
	}
	

}
