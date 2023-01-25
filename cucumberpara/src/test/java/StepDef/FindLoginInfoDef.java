package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FindLoginInfoPage;
import Pages.RegisterPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLoginInfoDef {

	WebDriver driver;
	
	@Given("Find- Browser is launched")
	public void find_browser_is_launched() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 driver.manage().window().maximize();

	}

	@When("Find- clicks Registration Button")
	public void find_clicks_registration_button() {
		 FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.RegisterButtonHome();


	}

	@And("Find- Firstly User enters Firstname as {string}")
	public void find_firstly_user_enters_firstname_as(String fname) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.FirstName(fname);

	}

	@And("Find- Firstly User enters  Lastname as {string}")
	public void find_firstly_user_enters_lastname_as(String lname) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.LastName(lname);

	}

	@And("Find- Firstly User enters  address as {string}")
	public void find_firstly_user_enters_address_as(String address) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.Address(address);

	}

	@And("Find- Firstly User enters  city as {string}")
	public void find_firstly_user_enters_city_as(String city) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.City(city);

	}

	@And("Find- Firstly User enters  state as {string}")
	public void find_firstly_user_enters_state_as(String state) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.State(state);

	}

	@And("Find- Firstly User enters  zipcode as {string}")
	public void find_firstly_user_enters_zipcode_as(String zipcode) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.ZipCode(zipcode);

	}

	@And("Find- Firstly User enters  Phone Number as {string}")
	public void find_firstly_user_enters_phone_number_as(String pno) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.PhoneNumber(pno);

	}

	@And("Find- Firstly User enters  SSN as {string}")
	public void find_firstly_user_enters_ssn_as(String ssn) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.SSN(ssn);

	}

	@And("Find- Firstly User enters  Username as {string}")
	public void find_firstly_user_enters_username_as(String uname) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.UserName(uname);

	}

	@And("Find- Firstly User enters  Password as {string}")
	public void find_firstly_user_enters_password_as(String pass) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.Password(pass);

	}

	@And("Find- Firstly User enters Repeat Password as {string}")
	public void find_firstly_user_enters_repeat_password_as(String rpass) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.RepeatPassword(rpass);

	}

	@And("Find- Firstly User Clicks on Register Button")
	public void find_firstly_user_clicks_on_register_button() {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		 fli.RegisterButton();

	}

	@And("Find- User Clicks on LogOut")
	public void find_user_clicks_on_log_out() {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.logOut();
		 

	}

	@And("Find- User Clicks on Forgot Login Info")
	public void find_user_clicks_on_forgot_login_info() {

		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.ForgotLoginInfo();
	}

	@And("Find -User enters forgot Firstname as {string}")
	public void find_user_enters_forgot_firstname_as(String fname) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.Findfname(fname);

	}

	@And("Find -User enters forgot Lastname as {string}")
	public void find_user_enters_forgot_lastname_as(String lname) {

		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindLname(lname);
	}

	@And("Find- User enters forgot Address as {string}")
	public void find_user_enters_forgot_address_as(String add) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindAddress(add);

	}

	@And("Find- User enters forgot city as {string}")
	public void find_user_enters_forgot_city_as(String city) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindCity(city);

	}

	@And("Find- User enters forgot state as {string}")
	public void find_user_enters_forgot_state_as(String state) {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindState(state);

	}

	@And("Find- User enters forgot zipcode as {string}")
	public void find_user_enters_forgot_zipcode_as(String zpc) {

		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindZipCode(zpc);
	}

	@And("Find- User enters forgot ssn as {string}")
	public void find_user_enters_forgot_ssn_as(String ssn) {

		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindSSN(ssn);
	}

	@And("User clicks on find my login info button")
	public void user_clicks_on_find_my_login_info_button() {

		FindLoginInfoPage fli = new FindLoginInfoPage(driver);
		 
		fli.FindLoginInfo();
	}
	
	@Then("Get Message of Valid Login Information")
	public void get_message_of_valid_login_information() {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);

		fli.ValidFindMyLoginMsg();
	}
	
	@Then("Get Message of Invalid Login Information")
	public void get_message_of_invalid_login_information() {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);

		fli.InvalidFindMyLoginMsg();
	}
	
	@Then("Get Message of Empty Login Information")
	public void get_message_of_empty_login_information() {
		FindLoginInfoPage fli = new FindLoginInfoPage(driver);

		fli.EmptyFindMyLoginMsg();
	}
	
	
	
    
	
	
}
