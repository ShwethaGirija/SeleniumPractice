package com.src.webcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");
	}
	
	@Test
	public void testsimplealert() throws InterruptedException
	{
		driver.switchTo().frame("google");
		
		driver.findElement(By.xpath("//button[contains(text(),'Menu')]")).click();
		
		
		
		
	}
	
	
}
