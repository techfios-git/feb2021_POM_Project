package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrwoserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrwoserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		
		DashboardPage dashboarPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboarPage.varifyDashboarPage();
		dashboarPage.clickCustomerButton();
		dashboarPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName("Selenium");
		addCustomerPage.enterCompanyName("Techfios");
		addCustomerPage.enterEmail("abc@techfios.com");
		
		//BrwoserFactory.tearDown();
	}

}
