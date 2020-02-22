package com.etlehiveTest.googleHomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest 
{
	
@Test        //done for TestNG
@Parameters({"firstname", "lastname", "phnno"})  // parameters from testng.xml

	public void f2(String ftn, String ltn, String phn) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chougule.sc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");  //open URL
		
		driver.manage().window().maximize();   // Maximize window
		
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  // implicit wait
		WebElement reg= driver.findElement(By.linkText("REGISTER"));
		reg.click();
		WebElement fn= driver.findElement(By.name("firstName"));
		fn.sendKeys(ftn);
        WebElement ln=driver.findElement(By.name("lastName"));
        ln.sendKeys(ltn);
        WebElement ph=driver.findElement(By.name("phone"));
        ph.sendKeys(phn);
        WebElement em=driver.findElement(By.name("userName"));
        em.sendKeys("sumitchougule1234@gmail.com");
        WebElement ad=driver.findElement(By.name("address1"));
        ad.sendKeys("A13-902 sunway megapolis");
        WebElement ad2=driver.findElement(By.name("address2"));
        ad2.sendKeys("Hinjawadi ph 3");
        WebElement ct=driver.findElement(By.name("city"));
        ct.sendKeys("Pune");
        WebElement st=driver.findElement(By.name("state"));
        st.sendKeys("Maharashtra");
        WebElement pc=driver.findElement(By.name("postalCode"));
        pc.sendKeys("411057");
        WebElement cnt=driver.findElement(By.name("country"));   // instead, use select class for drop down
        cnt.sendKeys("INDIA");
        WebElement un=driver.findElement(By.name("email"));
        un.sendKeys("sumitchougule1234");
        WebElement ps=driver.findElement(By.name("password"));
        ps.sendKeys("12345678");
        WebElement cnps=driver.findElement(By.name("confirmPassword"));
        cnps.sendKeys("12345678");
        WebElement submit=driver.findElement(By.name("register"));
        submit.click();
        WebElement login=driver.findElement(By.linkText("sign-in"));
        login.click();
        WebElement usn=driver.findElement(By.name("userName"));
        usn.sendKeys("sumitchougule1234");
        WebElement psn=driver.findElement(By.name("password"));
        psn.sendKeys("12345678");
        WebElement lgn=driver.findElement(By.name("login"));
        lgn.click();     
		
		Thread.sleep(5000);                      //wait for 5 Sec. But don't use this. Use wait
		driver.close();

	}

}
