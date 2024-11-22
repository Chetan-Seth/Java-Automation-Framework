package com.ui.pages;

import static com.constants.Env.*;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utilities.BrowserUtility;
import com.utilities.JSONUtility;
import com.utilities.LoggerUtility;

public final class HomePage extends BrowserUtility {
	Logger logger = LoggerUtility.getLogger(this.getClass());

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign')]");

	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);// To call the parent class constructor from the child class constructor
		// goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}

	public HomePage(WebDriver driver) {
		super(driver); // To Call the Parent Class constructor from the child constructor
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}

	public LoginPage goToLoginPage() {
		logger.info("Trying to perform click to go to signin page");
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
