package com.src.webcomponents;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new  ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		String parent_win_id = driver.getWindowHandle();

		List<WebElement> links = driver.findElements(By.xpath("//a[@name='link1']"));

		for(WebElement ele : links)
		{
			ele.click();
		}

		Set<String> allwin = driver.getWindowHandles();

		System.out.println("Total no of windows open is "+allwin.size());

		for(String id : allwin)
		{
			if(!parent_win_id.equals(id))
			{
				driver.switchTo().window(id);
				System.out.println("Titel is "+driver.getTitle());
				driver.close();
			}
		}

		driver.switchTo().window(parent_win_id);
		System.out.println("Parent title is "+driver.getTitle());
	}

}
