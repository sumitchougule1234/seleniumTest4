package com.etlehiveTest.googleHomePage;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.etlhiveTest.Home.HomePage1;
	
@Listeners(ListenerTest.class)
public class GoogleTest1            //main class
{
	
	@Test(dataProvider="abc", dataProviderClass=DataPrvdr.class)  // used for data providers 
	
	public void f1(String url) throws InterruptedException // for testNG converted main method to normal method
, IOException
	{
      System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("opening url");   // comes into test-output-->old--> report. used as comment in report
		//driver.get("http://newtours.demoaut.com");  //open URL
		driver.get(url);
		driver.manage().window().maximize();   // Maximize window

		HomePage1 hm= new HomePage1(driver);   // object created to call method-clickOnRegister
		
		// hm.clickOnRegister();              //method called without assertion    
		//Assert.assertTrue("Clicking on registration link",hm.clickOnRegister()); // method called from HomePage1
		Assert.assertTrue("Clicking on registration link",hm.clickOnPhpNetLink());                                                                        //assertion is used to compare the actual result of an application with the expected result
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
