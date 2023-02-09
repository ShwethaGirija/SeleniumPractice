package com.src.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperties {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		Properties prop  = new Properties();
		
		FileInputStream fis = new FileInputStream(new File("/Users/shwetha.mahadeva/eclipse-workspace/SeleniumPractice/src/main/java/details.properties"));
		
		prop.load(fis);
		
		System.out.println("Name is "+prop.getProperty("name"));
		
		System.out.println("Age is "+prop.getProperty("age"));
		


	}

}
