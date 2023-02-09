package com.src.webcomponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	}

	@Test
	public void testsimplealert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert message is "+alert.getText());
		Thread.sleep(2000);
		alert.accept();


	}

	@Test
	public void testConfirmationalert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert message is "+alert.getText());

		Thread.sleep(2000);
		alert.dismiss();

	}
	
	@Test
	public void testPromptalert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert message is "+alert.getText());

		Thread.sleep(2000);
		
		
		alert.sendKeys("Shwetha");
		alert.accept();

	}

	@AfterTest()
	public void teardown()
	{
		driver.close();
	}
}
