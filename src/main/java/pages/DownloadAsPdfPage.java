package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadAsPdfPage extends BasePage {

	//Declarations
	
	@FindBy(xpath="//span[text()='Download']")
	private WebElement download;
	
	
	//Initialization
		public DownloadAsPdfPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		
	//Utilization
		public void clickOnDownload() {	
			download.click();
		}

		
		public void printdownload() {
			
			System.out.println("Success : PDF downloaded Successfully");
		}
}
