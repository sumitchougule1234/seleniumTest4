package com.etlehiveTest.googleHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown 
{
@Test
	public void f3() throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");

		WebElement usn=driver.findElement(By.name("userName"));
        usn.sendKeys("sumitchougule1234");
        WebElement psn=driver.findElement(By.name("password"));
        psn.sendKeys("12345678");
        WebElement lgn=driver.findElement(By.name("login"));
        lgn.click();
          
        //dropdown begins
        
        WebElement psng= driver.findElement(By.name("passCount"));
        Select passenger= new Select(psng);   //Select is default class
        passenger.selectByVisibleText("3"); 
        
        WebElement DepFrm= driver.findElement(By.name("fromPort")); 
        Select Departure=new Select(DepFrm);
        Departure.selectByValue("London");      // value from f12
        
        WebElement onMonth=driver.findElement(By.name("fromMonth"));
        Select on=new Select(onMonth);
        on.selectByIndex(5);      // index starts from 0
        
	
	
		Thread.sleep(5000);                      //wait for 5 Sec. But don't use this. Use wait
		driver.close();
	
	}

}
