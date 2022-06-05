package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpanishPage extends BasePage {
	
	//Declarations
	@FindBy(xpath="//span[text()='English']")
	private WebElement english;
	
	
	@FindBy(xpath="//a[@title='Wikipedia:Bienvenidos']")
	private WebElement bienvenidos;
	
	
	
	//Initialization

	public SpanishPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void verifylanguage() {
		if(bienvenidos.getText().equals(bienvenidos))
			System.out.println("translated to Spanish Successfully");
		else {
			
			System.out.println("Translation Failed");
		}
		
	}

	public void clickOnEnglish() {
		english.click();
		
	}
	
	
	
	
	
	
}
