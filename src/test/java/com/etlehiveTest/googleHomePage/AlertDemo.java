package com.etlehiveTest.googleHomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
@Test
	public void f4() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		WebElement AB= driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button"));
		AB.click();
		driver.switchTo().alert().accept();       // switches driver
		
		
		WebElement CB=driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button"));
		CB.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();   //can use dismiss or accept
		
		
		WebElement AB1=driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(6) > div.panel-body > button"));
		AB1.click();
		//Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.sendKeys("Sumit");
		Thread.sleep(2000);
		al.accept();
		
				
		Thread.sleep(5000);                      //wait for 5 Sec. But don't use this. Use wait
		driver.close();

	}

}
