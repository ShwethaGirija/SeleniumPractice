package com.src.JSExeceutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExeceutor {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
				
				WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].value='Shwetha'",fname);
	}

}
