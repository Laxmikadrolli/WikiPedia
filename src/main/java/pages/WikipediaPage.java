package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage extends BasePage
{
	//Declaration
	@FindBy(id="searchInput")
	private WebElement searchBox;
	
	@FindBy(id="searchButton")
	private WebElement searchButton;
	
	@FindBy(xpath = "//span[text()='Contact us']")
	private WebElement contactus;
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='wpName']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement wlogin;
	
	@FindBy(xpath = "//a[span='Download as PDF']")
	private WebElement downloadaspdf;
	
	@FindBy(xpath ="//a[@title='Spanish']")
	private WebElement spanish;

	@FindBy(xpath ="//div[@class='suggestions-result']")
	private List<WebElement> allSuggestions;
	
	//Initialization
	public WikipediaPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterTextInSearchBox(String text)
	{
		searchBox.sendKeys(text);
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	public void clickOnContactUs() {
		contactus.click();
	}
	
	public void clickOnLogin() {
		login.click();	
	}
	
	public void enterUserName(String Username) {
		username.sendKeys(Username);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickOnLoginButton() {
			wlogin.click();
	}

	public void closeDriver() {
		
		driver.quit();
	}
  
	public void downloadAsPdf() {
		
		downloadaspdf.click();
	}
	
	public void clickOnSpanish() {
		
		spanish.click();
	}
	
	public void verifySuggestions(String suggestion)
	{
		System.out.println("Number of auto-suggestions: "+allSuggestions.size());
		for(WebElement element: allSuggestions)
		{
			String text = element.getText();
			System.out.println(text);
		}
		for(WebElement element: allSuggestions)
		{
			if(element.getText().equals(suggestion))
			{
				element.click();
				break;
			}
		}
		
	}
	
}
	
	
	
