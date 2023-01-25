package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RegisterPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterStepDef {

	WebDriver driver;

	@Given("Browser is launched and User clicks Registration Button")
	public void browser_is_launched_and_user_clicks_registration_button() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		RegisterPage reg = new RegisterPage(driver);

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

		reg.RegisterButtonHome();

	}

	@When("User enters Firstname as {string}")
	public void user_enters_firstname_as(String fname) {
		RegisterPage reg = new RegisterPage(driver);

		reg.FirstName(fname);

	}

	@And("User enters  Lastname as {string}")
	public void user_enters_lastname_as(String lname) {
		RegisterPage reg = new RegisterPage(driver);

		reg.LastName(lname);

	}

	@And("User enters  address as {string}")
	public void user_enters_address_as(String address) {
		RegisterPage reg = new RegisterPage(driver);

		reg.Address(address);

	}

	@And("User enters  city as {string}")
	public void user_enters_city_as(String city) {
		RegisterPage reg = new RegisterPage(driver);

		reg.City(city);

	}

	@And("User enters  state as {string}")
	public void user_enters_state_as(String state) {
		RegisterPage reg = new RegisterPage(driver);

		reg.State(state);

	}

	@And("User enters  zipcode as {string}")
	public void user_enters_zip_code_as(String zipcode) {

		RegisterPage reg = new RegisterPage(driver);

		reg.ZipCode(zipcode);
	}

	@And("User enters  Phone Number as {string}")
	public void user_enters_phone_number_as(String pno) {

		RegisterPage reg = new RegisterPage(driver);

		reg.PhoneNumber(pno);
	}

	@And("User enters  SSN as {string}")
	public void user_enters_ssn_as(String ssn) {

		RegisterPage reg = new RegisterPage(driver);

		reg.SSN(ssn);
	}

	@And("User enters  Username as {string}")
	public void user_enters_username_as(String uname) {

		RegisterPage reg = new RegisterPage(driver);

		reg.UserName(uname);
	}

	@And("User enters  Password as {string}")
	public void user_enters_password_as(String pass) {

		RegisterPage reg = new RegisterPage(driver);

		reg.Password(pass);
	}

	@And("User enters Repeat Password as {string}")
	public void user_enters_repeat_password_as(String rpass) {

		RegisterPage reg = new RegisterPage(driver);

		reg.RepeatPassword(rpass);
	}

	@And("User Clicks on Register Button")
	public void user_clicks_on_register_button() {
		RegisterPage reg = new RegisterPage(driver);

		reg.RegisterButton();
	}

	@Then("Get Registration SucessFull Message")
	public void get_registration_sucessfull_message() {
		RegisterPage reg = new RegisterPage(driver);

		reg.ValidRegisterMsg();
	}
	
	@Then("Get SSN Error Message")
	public void get_ssn_error_message() {
		RegisterPage reg = new RegisterPage(driver);

		reg.InvalidRegisterMsg();
	}
	
	@Then("Get Error Message")
	public void geterror_message() {
		RegisterPage reg = new RegisterPage(driver);

		reg.EmptyRegisterMsg();
	}

}
