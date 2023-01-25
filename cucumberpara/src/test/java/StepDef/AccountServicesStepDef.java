package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AccountServicesPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountServicesStepDef {

	WebDriver driver;

	JavascriptExecutor js;

	@SuppressWarnings("deprecation")
	@Given("Account Browser is launched")
	public void account_browser_is_launched() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		AccountServicesPage acc = new AccountServicesPage(driver);

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("Account User clicks Registration Button")
	public void account_user_clicks_on_registration_button() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.RegisterButtonHome();

	}

	@When("Account User enters Firstname as {string}")
	public void account_user_enters_firstname_as(String fname) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FirstName(fname);

	}

	@When("Account User enters  Lastname as {string}")
	public void account_user_enters_lastname_as(String lname) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.LastName(lname);

	}

	@When("Account User enters  address as {string}")
	public void account_user_enters_address_as(String address) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.Address(address);

	}

	@When("Account User enters  city as {string}")
	public void account_user_enters_city_as(String city) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.City(city);

	}

	@When("Account User enters  state as {string}")
	public void account_user_enters_state_as(String state) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.State(state);

	}

	@When("Account User enters  zipcode as {string}")
	public void account_user_enters_zip_code_as(String zipcode) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.ZipCode(zipcode);
	}

	@When("Account User enters  Phone Number as {string}")
	public void account_user_enters_phone_number_as(String pno) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PhoneNumber(pno);
	}

	@When("Account User enters  SSN as {string}")
	public void account_user_enters_ssn_as(String ssn) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SSN(ssn);
	}

	@When("Account User enters  Username as {string}")
	public void account_user_enters_username_as(String uname) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UserName(uname);
	}

	@When("Account User enters  Password as {string}")
	public void account_user_enters_password_as(String pass) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.Password(pass);
	}

	@When("Account User enters Repeat Password as {string}")
	public void account_user_enters_repeat_password_as(String rpass) {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.RepeatPassword(rpass);
	}

	@When("Account User Clicks on Register Button")
	public void account_user_clicks_on_register_button() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.RegisterButton();
	}

	@When("Account User Clicks on LogOut")
	public void account_user_clicks_on_log_out() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.logOut();
	}

	@When("Account User enters Login Username as {string}")
	public void account_user_enters_login_username_as(String unamelog) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UserNameLog(unamelog);

	}

	@When("Account User enters Login Password as {string}")
	public void account_user_enters_login_password_as(String passlog) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PasswordLog(passlog);

	}

	@When("Account User Clicks on Login Button")
	public void account_user_clicks_on_login_button() {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.Login();
	}

	@When("Click on Open Account")
	public void click_on_open_account() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.OpenAccount();
	}

	@When("Select Checking Account from Dropdown")
	public void select_checking_account_from_dropdown() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.CheckedAccount();
	}

	@When("Select Savings Account from Dropdown")
	public void select_savings_account_from_dropdown() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SavingsAccount();
	}

	@When("Click on Open Account Button")
	public void click_on_open_account_button() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.OpenAccountButton();
	}

	@Then("validate Checked Account Opening Message")
	public void validate_checked_account_opening_message() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.CheckingMsg();
	}

	@Then("validate Savings Account Opening Message")
	public void validate_savings_account_opening_message() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SavingsMsg();
	}

	@When("Click on Transfer Funds")
	public void click_on_transfer_funds() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.TransferFund();

	}

	@When("Enter transfer Amount as {string}")
	public void enter_transfer_amount_as(String ammm) throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.TransferAmount(ammm);
	}

	@When("Select Accounts for Transfer")
	public void select_accounts_for_transfer() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SelectTransferAccount();
	}

	@When("User Clicks on Tranfser Button")
	public void user_clicks_on_tranfser_button() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.Transfer();
	}

	@Then("Validate Tranfser Success Message")
	public void validate_transfer_success_message() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.TransferMsg();
	}

	@When("Click on Bill Pay")
	public void click_on_bill_pay() throws InterruptedException {

		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.BillPay();
	}

	@When("Enter payee name as {string}")
	public void enter_payee_name_as(String billname) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeName(billname);

	}

	@When("Enter Payee Address as {string}")
	public void enter_payee_address_as(String add) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeAddress(add);
	}

	@When("Enter Payee city as {string}")
	public void enter_payee_city_as(String city) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeCity(city);
	}

	@When("Enter Payee state as {string}")
	public void enter_payee_state_as(String state) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeState(state);
	}

	@When("Enter Payee zipcode as {string}")
	public void enter_payee_zipcode_as(String zpc) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeZipCode(zpc);
	}

	@When("Enter Payee phoneno as {string}")
	public void enter_payee_phoneno_as(String pno) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeePhoneNumber(pno);
	}

	@When("Enter Payee account as {string}")
	public void enter_payee_account_as(String paccno) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeAccountNo(paccno);
	}

	@When("Enter Payee verify account as {string}")
	public void enter_payee_verify_account_as(String pvno) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeVerifyAccountNo(pvno);
	}

	@When("Enter Payee amount as {string}")
	public void enter_payee_amount_as(String amm) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeAmount(amm);
	}

	@When("Select FromAccount for Bill Pay")
	public void select_from_account_for_bill_pay() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.PayeeFromAccount();
	}

	@When("Click on Send Payment Button")
	public void click_on_send_payment_button() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SendPayment();
	}

	@Then("Validate  Bill Pay Sucess Message")
	public void validate_bill_pay_sucess_message() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.BillPayMsg();
	}

	@When("Click on Find Transcation")
	public void click_on_find_transcation() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTransactionsLink();

	}

	@When("Enter Transcation Date as {string}")
	public void enter_transcation_date(String dt) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTranscationByDate(dt);
	}

	@When("Click on Find my transcation button")
	public void click_on_find_my_transcation_button() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTransactionDate();
	}

	@Then("validate Suecess message for date transcation")
	public void validate_suecess_message_for_date_transcation() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTranscationDateMsg();

	}

	@When("Enter Between Transcation Date as {string}")
	public void enter_between_transcation_date_as(String bdr) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.BetweenDateRange(bdr);
	}

	@When("Enter and Transcation Date as {string}")
	public void enter_and_transcation_date_as(String adr) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.AndDateRange(adr);
	}

	@When("Click on Find my transcation date range button")
	public void click_on_find_my_transcation_date_range_button() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTransactionDateRange();

	}

	@Then("validate Suecess message for date range transcation")
	public void validate_suecess_message_for_date_range_transcation() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTranscationDateMsg();
	}

	@When("Enter Amount to find transction as {string}")
	public void enter_amount_to_find_transction(String ammfind) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTranscationAmount(ammfind);
	}

	@When("Click on find Transcation Amount Button")
	public void click_on_find_transcation_amount_button() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.FindTransactionAmountButton();

	}

	@Then("validate Success message for Amount transcation")
	public void validate_success_message_for_amount_transcation() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.AmountTranscationMsg();
	}

	@When("Click on Update Contact Information")
	public void click_on_update_contact_information() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateContactLink();
	}

	@When("Update First Name as {string}")
	public void update_first_name_as(String ufname) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateFirstName(ufname);
	}

	@When("Update Last Name as {string}")
	public void update_last_name_as(String ulname) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateLastName(ulname);
	}

	@When("Update Address as {string}")
	public void update_address_as(String uadd) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateAddress(uadd);
	}

	@When("Update City as {string}")
	public void update_city_as(String ucity) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateCity(ucity);
	}

	@When("Update State as {string}")
	public void update_state_as(String ustate) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateState(ustate);
	}

	@When("Update ZipCode as {string}")
	public void update_zip_code_as(String uzpc) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateZipCode(uzpc);
	}

	@When("Update PhoneNumber as {string}")
	public void update_phone_number_as(String upno) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdatePhone(upno);
	}

	@When("Click on update button")
	public void click_on_update_button() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdateButton();
	}

	@Then("Validate Success Message for Update")
	public void validate_success_message_for_update() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.UpdatedMsg();
	}

	@When("Click on Request Loan")
	public void click_on_request_loan() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.RequestLoanLink();
	}

	@When("Enter Loan Amount as {string}")
	public void enter_loan_amount_as(String loanamm) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.LoanAmount(loanamm);

	}

	@When("Enter Downpayment as {string}")
	public void enter_downpayment_as(String downpay) {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.DownPayment(downpay);
	}

	@When("Select Account")
	public void select_account() {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.SelectAccountLoan();
	}

	@When("Click on Apply Now")
	public void click_on_apply_now() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.LoanApplyButton();
	}

	@Then("Validate Success Message for Loan")
	public void validate_success_message_for_loan() throws InterruptedException {
		AccountServicesPage acc = new AccountServicesPage(driver);

		acc.LoanMessage();
	}
}
