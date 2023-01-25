package StepDef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AdminPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminStepDef {

	WebDriver driver;
	JavascriptExecutor js;

	@Given("Admin Browser is Launched")
	public void admin_browser_is_launched() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		AdminPage admin = new AdminPage(driver);

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

	}

	@When("Click on Admin Page")
	public void click_on_admin_page() {
		AdminPage admin = new AdminPage(driver);

		admin.AdminLink();
	}

	@When("Click on Database Initialize")
	public void click_on_database_initialize() {

		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabaseInitializeBtn();

	}

	@Then("Get text Database initialized")
	public void get_text_database_initialized() {
		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabaseInitializeMsg();
	}

	@When("Click on Database Clean")
	public void click_on_database_clean() {
		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabaseCleanBtn();
	}

	@Then("Get text Database Clean")
	public void get_text_database_clean() {
		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabaseCleanMsg();
	}

	@When("Click on ShutDown Button")
	public void click_on_shut_down_button() {

		AdminPage admin = new AdminPage(driver);

		admin.AdminBatabaseShutdownbtn();
	}

	@Then("Get ShutDown Status")
	public void get_shut_down_status() {

		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabaseShutDownMsg();
	}

	@When("Click on Startup Button")
	public void click_on_startup_button() {

		AdminPage admin = new AdminPage(driver);

		admin.AdminBatabasestartupbtn();
	}

	@Then("Get Startup Status")
	public void get_startup_status() {
		AdminPage admin = new AdminPage(driver);

		admin.AdminDatabasestartupMsg();

	}
	
	@When("Click on SOAP Checkox")
	public void click_on_soap_checkox() {
		AdminPage admin = new AdminPage(driver);

		admin.SOAP();

	}

	@Then("Validate Soap Checkbox")
	public void validate_soap_checkbox() {
		AdminPage admin = new AdminPage(driver);

		admin.SOAPValidate();

	}

	@When("Click on RestXML Checkox")
	public void click_on_rest_xml_checkox() {
		AdminPage admin = new AdminPage(driver);

		admin.RestXML();

	}

	@Then("Validate RestXML Checkbox")
	public void validate_rest_xml_checkbox() {
		AdminPage admin = new AdminPage(driver);

		admin.RestXMLValidate();

	}

	@When("Click on RestJSON Checkox")
	public void click_on_rest_json_checkox() {
		AdminPage admin = new AdminPage(driver);

		admin.RestJSON();

	}

	@Then("Validate RestJSON Checkbox")
	public void validate_rest_json_checkbox() {
		AdminPage admin = new AdminPage(driver);

		admin.RestJSONValidate();

	}

	@When("Click on JDBC Checkox")
	public void click_on_jdbc_checkox() {
		AdminPage admin = new AdminPage(driver);

		admin.JDBC();

	}

	@Then("Validate JDBC Checkbox")
	public void validate_jdbc_checkbox() {
		AdminPage admin = new AdminPage(driver);

		admin.JDBCValidate();

	}
	
	@When("Enter Initial Balance as {string}")
	public void enter_initial_balance_as(String initbal) {
		AdminPage admin = new AdminPage(driver);

		admin.SetInitBal(initbal);

	}

	@When("Enter Minimum Balance as {string}")
	public void enter_minimum_balance_as(String minbal) {
		AdminPage admin = new AdminPage(driver);

		admin.SetMinBal(minbal);

	}

	@When("Select JMS LoanProvider Dropdown")
	public void select_jms_loan_provider_dropdown() {
		AdminPage admin = new AdminPage(driver);

		admin.LoanProviderDropDown();

	}

	@When("Select Available Funds LoanProcessor Dropdown")
	public void select_available_funds_loan_processor_dropdown() {

		AdminPage admin = new AdminPage(driver);

		admin.LoanProcessorDropdown();
	}

	@When("Enter Threshold Value as {string}")
	public void enter_threshold_value_as(String thresh) {

		AdminPage admin = new AdminPage(driver);

		admin.Threshold(thresh);
	}

	@When("Click on Submit Button")
	public void click_on_submit_button() {
		AdminPage admin = new AdminPage(driver);

		admin.Submit();

	}

	@Then("validate Setting Message")
	public void validate_setting_message() {
		AdminPage admin = new AdminPage(driver);

		admin.SettingsMsg();
	}


}
