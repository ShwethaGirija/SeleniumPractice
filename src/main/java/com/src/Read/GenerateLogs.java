package com.src.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class GenerateLogs {
	
	private static final Logger log = LogManager.getLogger(GenerateLogs.class);

	public static void main(String[] args) throws IOException {
		
		log.info("Program Started---->");
		
		
		Properties prop  = new Properties();
		
		FileInputStream fis = new FileInputStream(new File("/Users/shwetha.mahadeva/eclipse-workspace/SeleniumPractice/src/main/java/details.properties"));
		
		prop.load(fis);
		
		System.out.println("Name is "+prop.getProperty("name"));
		
		System.out.println("Age is "+prop.getProperty("age"));
		
		log.info("Program Ended");

	}

}
