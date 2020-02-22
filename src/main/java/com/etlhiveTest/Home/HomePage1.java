package com.etlhiveTest.Home;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.etlhive.utils.Utilities1;

public class HomePage1  extends Utilities1         //class for locating element
{		
		WebDriver driver;
		
		public HomePage1(WebDriver driver2) 
		{
			super();
			this.driver=driver2;
		    PageFactory.initElements(driver, this);
		}
		
		@FindBy (linkText="REGISTER")
	    public WebElement reg;           // reg object created
		
		@FindBy(linkText = "SIGN-ON")
		public WebElement signon;
		
		@FindBy(css = "#Main > section.grey-box > div > div > div:nth-child(2) > div > div > div.col-md-9 > div.col-md-12 > div > div:nth-child(1) > div > a")
		public WebElement phpNetLink;
		
		
		public boolean clickOnRegister()
		{
			return(clicksafelyOn(reg));      //parameterized method called from Utilities1 without creating object.Extended class
			//return true;			
		}


		
		public boolean clickOnSignOn()
		{
			return(clicksafelyOn(signon));
			//return true;
		}

		public boolean clickOnPhpNetLink() throws IOException 
			{
			TakesScreenshot scrsht= ((TakesScreenshot)driver); //Inbuilt class
			File src=scrsht.getScreenshotAs(OutputType.FILE);  // take screenshot as file
			File dest=new File("C:\\Users\\chougule.sc\\Desktop\\Selenium\\Screenshots\\test.png"); // gives destination for file storage
			FileUtils.copyFile(src,dest);   // saves screenshots
			return(clicksafelyOn(phpNetLink));      //parameterized method called from Utilities1 without creating object.Extended class
				//return true;			
			}
		
	
		

	}


