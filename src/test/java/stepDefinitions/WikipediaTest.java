package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import pages.DownloadAsPdfPage;
import pages.LeapLegalSoftwarePage;
import pages.ReadersPage;
import pages.SpanishPage;
import pages.WikipediaPage;

public class WikipediaTest {

	public WebDriver driver = null;
	WikipediaPage wikipediaPage;
	LeapLegalSoftwarePage leapLegalSoftwarePage;
	ContactUsPage contactUsPage;
	ReadersPage readersPage;
	DownloadAsPdfPage downloadAsPdfPage;
	SpanishPage spanishPage;
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
	}

	@Given("an user opens the browser")
	public void a_customer_open_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@When("user is on wikipedia page")
	public void a_customer_is_on_wikipedia_page() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		wikipediaPage = new WikipediaPage(driver);
		leapLegalSoftwarePage = new LeapLegalSoftwarePage(driver);
		contactUsPage = new ContactUsPage(driver);
		readersPage = new ReadersPage(driver);
		downloadAsPdfPage = new DownloadAsPdfPage(driver);
		spanishPage = new SpanishPage(driver);
	}

	@When("user clicks on login")
	public void customer_clicks_on_login() {
		wikipediaPage.clickOnLogin();

	}

	@When("user enters username as {string}")
	public void customer_enters_username_as(String string) {

		wikipediaPage.enterUserName(string);
	}

	@When("user enters password as {string}")
	public void customer_enters_password_as(String string) {

		wikipediaPage.enterPassword(string);
	}

	@Then("user clicks on login button")
	public void customer_clicks_on_login_button() {

		wikipediaPage.clickOnLoginButton();
	}

	@When("user enters {string} in search box")
	public void customer_enter_leap_legal_software_in_search_box(String text) {
		wikipediaPage.enterTextInSearchBox(text);
	}

	@When("user click search button")
	public void customer_click_serch_button() {
		wikipediaPage.clickOnSearchButton();
	}

	@Then("user should get {string} page")
	public void customer_should_get_leap_legal_software_page(String heading) {
		leapLegalSoftwarePage.verifyFirstHeading(heading);
	}

	@When("user clicks on Contact Us button")
	public void customer_clicks_on_contact_us_button() {
		wikipediaPage.clickOnContactUs();
	}

	@When("user clicks on Reader button and verifies")
	public void customer_clicks_on_reader_button_and_verifies() {
		contactUsPage.clickOnReader();
	}

	@Then("user verifies the broken links")
	public void customer_verifies_the_broken_links() {
		readersPage.verfyBrokenLiksOnThePage();
	}

	@When("user closes the browser")
	public void user_closessss_the_browser() {
		wikipediaPage.closeDriver();
	}

	@When("user cliks on download as pdf link")
	public void customer_cliks_on_download_as_pdf_link() {
		wikipediaPage.downloadAsPdf();

	}

	@When("user should click on download button")
	public void customer_should_click_on_download_button() throws InterruptedException {
		downloadAsPdfPage.clickOnDownload();
		Thread.sleep(5000);

	}

	@Then("pdf can be downloaded")
	public void pdf_can_be_downloaded() {
		downloadAsPdfPage.printdownload();

	}

	@When("user clicks on Espanol")
	public void customer_clicks_on_espanol() {
		wikipediaPage.clickOnSpanish();
	}

	@When("user verifies the page")
	public void customer_verifies_the_page() {
		spanishPage.verifylanguage();

	}

	@When("user clicks on English")
	public void customer_clicks_on_english() {
		spanishPage.clickOnEnglish();
	}

	@Then("user should be able to click on {string} and user should land on {string} page")
	public void user_should_be_able_to_click_on_and_user_should_land_on_page(String string, String string2) {
		wikipediaPage.verifySuggestions(string);
		leapLegalSoftwarePage.verifyFirstHeading(string2);
	}
}
