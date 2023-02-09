package com.src.mouseactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		
		Actions act = new Actions(driver);
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightclickbtn).build().perform();
		
		WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
		
		paste.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		String alertmsg = alert.getText();
		
		System.out.println("ALert message is "+alertmsg);
		
		alert.accept();
		
	}

}
