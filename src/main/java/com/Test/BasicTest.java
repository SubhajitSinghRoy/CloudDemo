package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	@Test
	public  void main() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");

		System.out.println("Website is " + driver.getCurrentUrl());
		System.out.println("Page title is " + driver.getTitle());

		Thread.sleep(7000);

		driver.quit();
	}

}
