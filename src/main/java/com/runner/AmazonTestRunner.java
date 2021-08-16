package com.runner;
import com.thread.*;

public class AmazonTestRunner {
	
	public static void main(String[] args) {
//		Thread t1 = new AmazonFeatureThread("ChromeThread","chrome");
//		Thread t2 = new AmazonFeatureThread("FirefoxThread","firefox");
//		
//		System.out.println("---------Threads Started--------");
//		t1.start();
//		t2.start();
		
		int chromecount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxcount = Integer.parseInt(System.getProperty("firefox"));
	
		System.out.println("Total Chrome Count " + chromecount);
		System.out.println("Total Chrome Count " + firefoxcount);
		
		for(int i=0, j=0;i<chromecount||j<firefoxcount;i++,j++) {
			new AmazonFeatureThread("ChromeThread","chrome").start();
			new AmazonFeatureThread("FirefoxThread","firefox").start();
			System.out.println("Thread Ended");
		}
	}

}
