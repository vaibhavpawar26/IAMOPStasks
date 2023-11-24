package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3 {
	String url = "https://www.airindia.in/";
	String from = "Mumbai";
	String to = "Toronto";

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='From']")).sendKeys(from);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ngb-typeahead-window[@id='ngb-typeahead-0']/button[1]")).click();

		driver.findElement(By.xpath("//input[@id='To']")).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ngb-typeahead-window[@id='ngb-typeahead-1']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='DepartDate']/following-sibling::input")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//ngb-datepicker//div[@class='ngb-dp-content ngb-dp-months']//div[@aria-label=\"Monday, December 25, 2023\"]"))
				.click();

		driver.findElement(By.xpath("//input[@aria-label='Return']/following-sibling::input")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(
				"//ngb-datepicker//div[@class='ngb-dp-content ngb-dp-months']//div[@aria-label='Wednesday, January 10, 2024']"))
				.click();
		
		
		
		driver.findElement(By.xpath("//div[@id='dropdownForm1']")).click();
	
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Adult')]/../following-sibling::div/button[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Adult')]/../following-sibling::div/button[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Adult')]/../following-sibling::div/button[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Adult')]/../following-sibling::div/button[2]")).click();
		
		//we can write logic to check the 5
		
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Children')]/../following-sibling::div/button[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Passenger']//p[contains(text(), 'Children')]/../following-sibling::div/button[2]")).click();
		
		//click show flights
		driver.findElement(By.xpath("//button[text()=' SHOW FLIGHTS ']")).click();
		
		
		
		
	}
}
