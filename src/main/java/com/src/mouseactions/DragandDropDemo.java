package com.src.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(2000);
		
		WebElement framele = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(framele);
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.clickAndHold(ele)
		.moveToElement(target)
		.release()
		.build()
		.perform();
		
		
		
	}

}
