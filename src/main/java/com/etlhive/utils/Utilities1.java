package com.etlhive.utils;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities1 

{
	WebDriver driver;
	
	
	public boolean clicksafelyOn(WebElement ele)
	
	{
		try 
		{
	
		ele.click();
		return true;
		}
		
		catch(NoSuchElementException e)
		{ System.out.println("element not present on screen");
		return false;}
		
		catch (Exception a)     // all kind of exception caught here
		{a.printStackTrace();
		return false;}
		
		finally                // Finally will execute always irrespective of pass or fail of try,catch
		{System.out.println("finally is running"); }
	}
	
}
