package com.src.webcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new  ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

	}

}
