package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void BS() throws Exception {
		 config=new ConfigDataProvider();
		 excel=new ExcelDataProvider();
		
	}
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(config.get_BaseUrl_QA1());
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
		
		
		
	}

}
