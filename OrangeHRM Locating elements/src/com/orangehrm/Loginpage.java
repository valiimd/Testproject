package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\new 730AM suresh sir selenium\\Drivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys("suresh selenium");
		Thread.sleep(4000);
		d.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("first down passed");
		Thread.sleep(4000);
		d.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("second down passed");
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("clicked on the Enter btn");
		d.quit();
	}

}
