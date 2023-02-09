package com.src.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
	
				driver.findElement(By.id("tags")).sendKeys("a");
				
				Thread.sleep(2000);
				
				Select select = new Select(driver.findElement(By.id("tags")).sendKeys("a"));
				
				select.
				
		List<WebElement> opts =		driver.findElements(By.xpath(" //ul[@id='ui-id-1']/li/div"));
				
		for(WebElement temp: opts)
		{
			System.out.println(temp.getText());
		}
	}

}
