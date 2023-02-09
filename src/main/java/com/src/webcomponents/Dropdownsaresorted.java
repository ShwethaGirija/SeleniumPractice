package com.src.webcomponents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsaresorted {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		WebElement tools = driver.findElement(By.id("tools"));
		
		Select select = new Select(tools);
		
	List<WebElement> opts =	select.getOptions();
	
	List<String> originallist = new ArrayList<String>();
	List<String> templist = new ArrayList<String>();
	
	for(WebElement ele: opts)
	{
		originallist.add(ele.getText());
		templist.add(ele.getText());
	}

	Collections.sort(templist);
	System.out.println("Sorted lists is "+templist);
	
	
	Collections.reverse(templist);
	System.out.println("Reverese Sorted lists is "+templist);
	
}
}
