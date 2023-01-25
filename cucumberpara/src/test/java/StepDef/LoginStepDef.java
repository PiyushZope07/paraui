package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
WebDriver driver;
    
@Given("Browser is launched")
public void browser_is_launched() {
	WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 LoginPage log = new LoginPage(driver);
		 
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 driver.manage().window().maximize();
		 
		

	}

	@When("User clicks Registration Button")
	public void user_clicks_on_registration_button() {
		LoginPage log = new LoginPage(driver);
		
		 log.RegisterButtonHome();


	}
	
	@And("Firstly User enters Firstname as {string}")
	public void firstly_user_enters_firstname_as(String fname) {
		LoginPage log = new LoginPage(driver);
		
		log.FirstName(fname);

	}

	@And("Firstly User enters  Lastname as {string}")
	public void firstly_user_enters_lastname_as(String lname) {
		LoginPage log = new LoginPage(driver);
		
		log.LastName(lname);

	}

	@And("Firstly User enters  address as {string}")
	public void firstly_user_enters_address_as(String address) {
		LoginPage log = new LoginPage(driver);
		
		log.Address(address);

	}

	@And("Firstly User enters  city as {string}")
	public void firstly_user_enters_city_as(String city) {
		LoginPage log = new LoginPage(driver);
		
		log.City(city);

	}

	@And("Firstly User enters  state as {string}")
	public void firstly_user_enters_state_as(String state) {
		LoginPage log = new LoginPage(driver);
		
		log.State(state);

	}

	@And("Firstly User enters  zipcode as {string}")
	public void firstly_user_enters_zip_code_as(String zipcode) {

		LoginPage log = new LoginPage(driver);
		
		log.ZipCode(zipcode);
	}

	@And("Firstly User enters  Phone Number as {string}")
	public void firstly_user_enters_phone_number_as(String pno) {

		LoginPage log = new LoginPage(driver);
		
		log.PhoneNumber(pno);
	}

	@And("Firstly User enters  SSN as {string}")
	public void firstly_user_enters_ssn_as(String ssn) {

		LoginPage log = new LoginPage(driver);
		
		log.SSN(ssn);
	}

	@And("Firstly User enters  Username as {string}")
	public void firstly_user_enters_username_as(String uname) {

		LoginPage log = new LoginPage(driver);
		
		log.UserName(uname);
	}

	@And("Firstly User enters  Password as {string}")
	public void firstly_user_enters_password_as(String pass) {

		LoginPage log = new LoginPage(driver);
		
		log.Password(pass);
	}

	@And("Firstly User enters Repeat Password as {string}")
	public void firstly_user_enters_repeat_password_as(String rpass) {

		LoginPage log = new LoginPage(driver);
		
		log.RepeatPassword(rpass);
	}

	@And("Firstly User Clicks on Register Button")
	public void firstly_user_clicks_on_register_button() {
		LoginPage log = new LoginPage(driver);
		
		log.RegisterButton();
	}
	
	@And("User Clicks on LogOut")
	public void user_clicks_on_log_out() {
		LoginPage log = new LoginPage(driver);
		
		log.logOut();
	}
	
	@And("User enters Login Username as {string}")
	public void user_enters_login_username_as(String unamelog) {
		LoginPage log = new LoginPage(driver);
		
		log.UserNameLog(unamelog);

	}

	@And("User enters Login Password as {string}")
	public void user_enters_login_password_as(String passlog) {
		LoginPage log = new LoginPage(driver);

		log.PasswordLog(passlog);

	}

	@And("User Clicks on Login Button")
	public void user_clicks_on_login_button() {

		LoginPage log = new LoginPage(driver);

		log.Login();
	}
	
	@Then("validate whether log out is present or not")
	public void validate_whether_log_out_is_present_or_not() {
		LoginPage log = new LoginPage(driver);

		log.LogOutPresent();
	}
	
	@Then("Get Invalid Details Error Message")
	public void get_invalid_details_error_message() {
		LoginPage log = new LoginPage(driver);

		log.InvalidLoginMsg();
	}
	
	@Then("Get Empty Fields Error Message")
	public void get_empty_fields_error_message() {
		LoginPage log = new LoginPage(driver);

		log.EmptyFieldsLoginMsg();
	}
}
