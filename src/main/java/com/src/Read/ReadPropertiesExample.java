package com.src.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		Thread.sleep(2000);
		
		
		String first_Name = readProperties("fname");
		String last_Name = readProperties("lname");
		
		driver.findElement(By.name("firstname")).sendKeys(first_Name);
		
		driver.findElement(By.name("lastname")).sendKeys(last_Name);
		
		
		
		
		
		Thread.sleep(2000);
		
		//driver.close();
		
		
	}
	
	public static String readProperties(String propName) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(new File("/Users/shwetha.mahadeva/eclipse-workspace/SeleniumPractice/src/main/java/form.properties"));
		
		prop.load(fis);
		
		String value = prop.getProperty(propName);
		
		return value;
	
	}

}
