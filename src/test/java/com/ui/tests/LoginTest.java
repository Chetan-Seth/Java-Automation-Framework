package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.TestBase;
import com.ui.pojo.User;
import com.utilities.LoggerUtility;

@Listeners({com.ui.listeners.TestListener.class})
public final class LoginTest extends TestBase {

	Logger logger = LoggerUtility.getLogger(this.getClass());

	@Test(description = "\n Verifies the Login of New User ", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Chetan Seth");
	}

	@Test(description = "\n Verifies the Login of New User ", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider")
	public void loginCSVTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Chetan Seth");
	}

	@Test(description = "\n Verifies the Login of New User ", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider", retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)

	public void loginExcelTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Chetan Seth1");
	}

}
