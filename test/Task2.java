package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task2 {
	String url = "https://the-internet.herokuapp.com/login";
//	String name = "tomsmith";
//	String password = "SuperSecretPassword!";

	@DataProvider(name = "testdata")
	public Object[][] testdata1() {

		Object[][] data = new Object[][] {

				{ "tomsmith1", "SuperSecretPassword" }, { "tomsmith2", "SuperSecretPassword" },
				{ "tomsmith", "SuperSecretPassword!" } };

		return data;
	}

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

	@Test(dataProvider = "testdata")
	public void test1(String uname, String pwd) throws InterruptedException {
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.id("username"));
		name.clear();
		name.sendKeys(uname);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pwd);

	}
}
