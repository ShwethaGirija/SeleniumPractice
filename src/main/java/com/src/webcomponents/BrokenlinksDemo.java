package com.src.webcomponents;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrokenlinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new FirefoxDriv

		driver.manage().window().maximize();
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.set


		driver.get("http://seleniumpractise.blogspot.com/2021/11/broken-links-and-images.html");

		List<WebElement> links =	driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));


		System.out.println("Size of Total links "+links.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		for(WebElement link:links)
		{
			if(link.getAttribute("href")!=null && !link.getAttribute("href").contains("javascript") )
			{
				activelinks.add(link);
			}
		}

		System.out.println("Size of active links "+activelinks.size());


		//check connection of active links using HttpURLConnection

		for(int i=0;i<activelinks.size();i++)
		{
			HttpURLConnection conn = (HttpURLConnection)new URL(activelinks.get(i).getAttribute("href")).openConnection();
			conn.connect();
			String response = conn.getResponseMessage();//ok
			conn.disconnect();

			System.out.println(activelinks.get(i).getAttribute("href")+" -----> "+response);

		}


	}

}
