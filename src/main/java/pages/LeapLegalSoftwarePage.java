package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeapLegalSoftwarePage
{
	@FindBy(id="firstHeading")
	public WebElement heading;
	
	public LeapLegalSoftwarePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyFirstHeading(String expectedHeading)
	{
		if(heading.getText().equals(expectedHeading))
		{
			System.out.println("Test Case passed");
		}else {
			System.out.println("Test Case Failed");
		}
	}
}
