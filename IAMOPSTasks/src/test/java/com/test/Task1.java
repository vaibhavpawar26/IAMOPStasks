package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {
	String url = "https://practicetestautomation.com/practice-test-login/";
	String name = "student";
	String password = "Password123";
	
	//update info
	String f_name = "qa1";
	String email = "qa1@automation.com";
	String msg = "this is info";
	
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		//
		
		Thread.sleep(3000);
		//Home page navigation
		driver.findElement(By.xpath("//li[@id='menu-item-43']/a")).click();
		//Contact page navigation
		driver.findElement(By.xpath("//li[@id='menu-item-18']/a")).click();
		
		//update contact info and submit
		driver.findElement(By.name("wpforms[fields][0][first]")).sendKeys(f_name);
		
		driver.findElement(By.name("wpforms[fields][1]")).sendKeys(email);
		
		driver.findElement(By.name("wpforms[fields][2]")).sendKeys(msg);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
		
		//click submit - it is opening captcha so did not submit.
//		driver.findElement(By.id("wpforms-submit-161")).click();
	
		
	}

}
