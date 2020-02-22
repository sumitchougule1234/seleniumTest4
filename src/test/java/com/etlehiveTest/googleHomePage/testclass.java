package com.etlehiveTest.googleHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {

@Test(groups="abc")
public void required() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("Required is running");
	driver.close();

}

@Test(groups="pqr")
public void optional() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("Optional is running");
	driver.close();
}

@Test(dependsOnGroups= {"abc"})
public void testing() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("testing is running");
	driver.close();
}

@Test(dependsOnGroups="pqr")
public void selenium() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("selenium is running");
	driver.close();
}

}
