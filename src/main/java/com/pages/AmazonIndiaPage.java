package com.pages;

import org.openqa.selenium.By;

public class AmazonIndiaPage extends BasePage {
	
	//Page Actions
	
	public void getHeaderLink() {
		driver.findElements(By.xpath("//a[contains(@class,'nav-a')]")).stream().forEach(x->System.out.println(x.getText()));
	}
	
	public boolean verifySignInPage() {
		return driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).isDisplayed();
	}
	
	public void tearDown() {
		driver.quit();
	}

}
