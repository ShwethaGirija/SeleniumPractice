package com.src.JSExeceutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorClick {

	public static void main(String[] args) throws InterruptedException {
		

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.softwaretestinghelp.com/handle-scroll-bar-in-selenium/");
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("scroll(0,800)");
				
				Thread.sleep(2000);
				
				js.executeScript("scroll(0,-400)");
				

	}

}
