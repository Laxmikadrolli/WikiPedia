package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.GenericUtils;

public class ReadersPage extends BasePage {
	//Declaration
	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	//Initialization
	public ReadersPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void verfyBrokenLiksOnThePage() {
		GenericUtils.verifyBrokenLinks(allLinks);
	}

}
