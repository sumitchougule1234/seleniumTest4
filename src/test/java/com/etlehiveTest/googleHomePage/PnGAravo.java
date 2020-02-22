package com.etlehiveTest.googleHomePage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PnGAravo {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("opening Aravo url");   // comes into test-output-->old--> report. used as comment in report
		driver.get("https://ssopgprod.aravo.com/aems/login.do?sessionExpired=true");

		driver.manage().window().maximize();
		
		WebElement lp=driver.findElement(By.xpath("/html/body/div/div/div/form/div/div/div/a"));
		lp.click();
		WebElement usnm=driver.findElement(By.id("username"));
		usnm.sendKeys("chougule.sc@pg.com");
		WebElement psn=driver.findElement(By.id("password"));
		psn.sendKeys("India111");
		WebElement lg=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/span[1]"));
		lg.click();
		Thread.sleep(20000);
		
//		WebDriverWait wt=new WebDriverWait(driver,20);   // explicit wait
//		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("search.organizationName")));
//		
		
		WebElement input=driver.findElement(By.cssSelector("#search\\.organizationName"));
		
		input.sendKeys("20581252");
		
//		Actions act=new Actions(driver);     //Actions class is selenium default class
//		act.keyDown(Keys.ENTER);
//		act.keyUp(Keys.ENTER);
//		
//		WebElement sup=driver.findElement(By.linkText(" BABA ELECTRICALS"));
//		act.contextClick(sup);      // right click
//		
//		Robot rb=new Robot();         // robot class for handling such cases
//		rb.keyPress(KeyEvent.VK_DOWN);
		
		
		
	}

}
