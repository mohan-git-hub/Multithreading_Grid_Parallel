package com.home.GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {
	
	public static void main(String[] args) throws MalformedURLException {
		
		//1. Desired Capabilities
		DesiredCapabilities des = new DesiredCapabilities();
		des.setBrowserName("chrome");
		des.setPlatform(Platform.WINDOWS);
		
		//2. Chrome Options Definition
		ChromeOptions CO = new ChromeOptions();
		CO.setAcceptInsecureCerts(true);
		CO.merge(des);
		
		String HubURL = "http://192.168.225.42:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(HubURL),CO);
		
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.quit();
			
	}

}
