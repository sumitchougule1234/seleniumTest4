package com.etlehiveTest.googleHomePage;

import org.testng.annotations.DataProvider;

public class DataPrvdr {
	@DataProvider(name="abc")
	public static  Object[][] googleTest1() {
		return new Object[][]{{"http://phptravels.com/demo/"}};
		
	}

}
