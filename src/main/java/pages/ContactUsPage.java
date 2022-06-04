package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
	//Declaration
	@FindBy(xpath = "//span[text()='Readers']")
	private WebElement readers;

	//Initialization
	public ContactUsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void clickOnReader() {
		readers.click();
	}

}
