package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public WebDriver driver;
	
	public WebDriver setUp(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","G:\\Mohan\\Selenium_Software\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Mohan\\Selenium_Software\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
