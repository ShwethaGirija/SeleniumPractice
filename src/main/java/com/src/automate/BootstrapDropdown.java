package com.src.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		
				driver.findElement(By.xpath("//button[@id='menu1']")).click();
				
			List<WebElement> opts =	driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		System.out.println("No of options is "+opts.size());
		
		for(WebElement temp:opts)
		{
			System.out.println(temp.getText());
			if(temp.getText().equals("JavaScript"))
			{
				temp.click();
				break;
			}
			
			
		}
			

	}

}
