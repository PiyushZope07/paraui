package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RedPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedirectableLinksStepDef {

	WebDriver driver;

	@Given("Redirect Browser is launched")
	public void redirect_browser_is_launched() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		RedPage rlp = new RedPage(driver);

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

	}

	@When("click on About link")
	public void click_on_about_link() {

		RedPage rlp = new RedPage(driver);

		rlp.about();

	}

	@Then("About link should be redirected")
	public void about_link_should_be_redirected() {
		RedPage rlp = new RedPage(driver);

		rlp.AboutRedirect();
	}

	@When("click on Products link")
	public void click_on_products_link() {
		RedPage rlp = new RedPage(driver);

		rlp.Product();
	}

	@Then("Product link should be redirected")
	public void product_link_should_be_redirected() {
		RedPage rlp = new RedPage(driver);

		rlp.ProductsRedirect();
	}

	@When("click on Location link")
	public void click_on_location_link() {
		RedPage rlp = new RedPage(driver);

		rlp.Location();

	}

	@Then("Location link should be redirected")
	public void location_link_should_be_redirected() {
		RedPage rlp = new RedPage(driver);

		rlp.LocationRedirect();

	}

	@When("click on BookStore link")
	public void click_on_book_store_link() {
		RedPage rlp = new RedPage(driver);

		rlp.BookStore();

	}

	@Then("BookStore link should be redirected")
	public void book_store_link_should_be_redirected() {

		RedPage rlp = new RedPage(driver);

		rlp.BookStoreRedirect();
	}

	@When("click on LoanProcessorService link")
	public void click_on_loan_processor_service_link() {
		RedPage rlp = new RedPage(driver);

		rlp.LoanProcessor();

	}

	@Then("LoanProcessorService link should be redirected")
	public void loan_processor_service_link_should_be_redirected() {

		RedPage rlp = new RedPage(driver);

		rlp.LoanProcessorRedirect();
	}

	@When("click on ParaBankService link")
	public void click_on_para_bank_service_link() {
		RedPage rlp = new RedPage(driver);

		rlp.Parbank();

	}

	@Then("ParaBankService link should be redirected")
	public void para_bank_service_link_should_be_redirected() {

		RedPage rlp = new RedPage(driver);

		rlp.ParabankRedirect();
	}

	@When("click on WADL link")
	public void click_on_wadl_link() {
		RedPage rlp = new RedPage(driver);

		rlp.WADL();

	}

	@Then("WADL link should be redirected")
	public void wadl_link_should_be_redirected() {

		RedPage rlp = new RedPage(driver);

		rlp.WADLRedirect();
	}

	@When("click on SWAGGER link")
	public void click_on_swagger_link() {
		RedPage rlp = new RedPage(driver);

		rlp.Swagger();
	}

	@Then("SWAGGER link should be redirected")
	public void swagger_link_should_be_redirected() {
		RedPage rlp = new RedPage(driver);

		rlp.SwaggerRedirect();
	}
	
	@And("Close the Driver")
	public void close_the_driver() {
		driver.close();
	}

}
