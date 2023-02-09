package com.src.mouseactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		WebElement btn = driver.findElement(By.xpath("//button[text()='Automation Tools']"));

		Actions act = new Actions(driver);

		act.moveToElement(btn).build().perform();

	//	Thread.sleep(2000);

		List<WebElement>	elements =   driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
System.out.println("No of elements is "+elements.size());
		
		for(WebElement temp:elements)
		{
			System.out.println(temp.getText()+"....."+temp.isEnabled());
			if(temp.getText().equals("Appium"))
			{
				temp.click();
				break;
			}
			
		}

	}

}
