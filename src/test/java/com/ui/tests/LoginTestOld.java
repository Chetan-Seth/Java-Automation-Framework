//package com.ui.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.utilities.BrowserUtility;
//
//public class LoginTestOld {
//	
//
//	public static void main(String[] args){
//		WebDriver wd = new ChromeDriver();
//		BrowserUtility browserUtility = new BrowserUtility (wd);
//		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign')]");
//		By emailAddressLocator = By.id("email");
//		By passwordLocator = By.id("passwd");
//		By signInButtonLocator = By.id("SubmitLogin");
//
//		browserUtility.goToWebsite("http://www.automationpractice.pl/");
//		browserUtility.maximizeWindow();
//		browserUtility.clickOn(signInLinkLocator);
//		browserUtility.enterText(emailAddressLocator, "widam13788@anypng.com");
//		browserUtility.enterText(passwordLocator, "password");
//		browserUtility.clickOn(signInButtonLocator);
//		wd.quit();
//	}
//
//}
