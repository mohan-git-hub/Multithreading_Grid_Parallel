package com.thread;
import com.pages.*;

public class AmazonFeatureThread extends Thread{
	
	public String BrowserName;
	AmazonIndiaPage amazonIndia;
	
	public AmazonFeatureThread(String ThreadName, String BrowserName) {
		super(ThreadName);
		this.BrowserName=BrowserName;
		amazonIndia = new AmazonIndiaPage();
	}
	
	@Override
	public void run() {
		System.out.println("Thread----Started - " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			amazonIndia.setUp(BrowserName);
			if(amazonIndia.verifySignInPage()) {
				amazonIndia.getHeaderLink();	
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			amazonIndia.tearDown();
		}
		System.out.println("Thread----Ended - " + Thread.currentThread().getName());
		
	}
}
