package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	
	public void enterFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + randomGenerator(999));
	}
	
	public void enterCompanyName(String company) {
		selectDropdown(COMPANY_ELEMENT, company);
	}
	
	public void enterEmail(String email) {
		EMAIL_ELEMENT.sendKeys(randomGenerator(99) + email);
	}

	

}
