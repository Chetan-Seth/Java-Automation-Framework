package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constants.Browser;
import com.utilities.BrowserUtility;
import com.utilities.LambdaTestUtility;
import com.utilities.LoggerUtility;

public class TestBase {

	public HomePage homePage; // creating instance variable to avoid the use of local variable
	Logger logger = LoggerUtility.getLogger(this.getClass());
	private boolean isLambdaTest;
	
	
	@Parameters({"browser","isLambdaTest","isHeadless"})
	
	@BeforeMethod(description = "Load the Home page of the Website")
	public void setup(
		@Optional("chrome") String browser , 
		@Optional("false")boolean isLambdaTest,
		@Optional("true")boolean isHeadless,ITestResult result) {
		
		this.isLambdaTest= isLambdaTest;
		WebDriver lambdaDriver;
		if (isLambdaTest) {
			lambdaDriver = LambdaTestUtility.initializeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
		} else {
			logger.info("Load the Home page of the Website");
			homePage = new HomePage(Browser.valueOf(browser.toUpperCase()), isHeadless);
		}
	}

	public BrowserUtility getInstance() {
		return homePage;
	}

	@AfterMethod(description="Tear Down the Browser")
	public void tearDown() {
		if (isLambdaTest) {
			LambdaTestUtility.quitSession();//quit browser session on LambdaTest
		} else {
			homePage.quit();//local 
		}
	}

}
