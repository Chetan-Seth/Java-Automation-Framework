package com.ui.tests;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utilities.BrowserUtility;
import com.utilities.LambdaTestUtility;
import com.utilities.LoggerUtility;

public class TestBase {

	protected HomePage homePage;
	Logger logger = LoggerUtility.getLogger(this.getClass());
	private boolean isLambdaTest;


	@Parameters({"browser", "isLambdaTest", "isHeadless"})
	@BeforeMethod(description = "Load the Homepage of the Application")
	public void setUp(
			@Optional("chrome")String browser,
			@Optional("false")boolean isLambdaTest,
			@Optional("false")boolean isHeadless, ITestResult result) {

		this.isLambdaTest = isLambdaTest;

		WebDriver lambdaDriver;
		if (isLambdaTest) {

			lambdaDriver = LambdaTestUtility.initializeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
		} else {
			// running the test on local machine
			logger.info("Load the Homepage of the Application");
			homePage = new HomePage(Browser.valueOf(browser.toUpperCase()), isHeadless);
		}

	}

	public BrowserUtility getInstance() {

		return homePage;
	}

	@AfterMethod(description = "Tear Down the Browser")
	public void tearDown() {
		if (isLambdaTest) {
			LambdaTestUtility.quitSession();// close the browser session on lambdatest
		} else {
			homePage.quit(); // close the local machine session
		}

	}
}