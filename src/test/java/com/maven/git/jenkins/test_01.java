package com.maven.git.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_01 {
	@Test
	public void run() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://flipkart.com");
	}
}
