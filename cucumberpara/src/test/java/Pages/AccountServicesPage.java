package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountServicesPage {

	WebDriver driver;
	JavascriptExecutor js;

	public AccountServicesPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
	}

	By registerbuttonhome = By.xpath("//a[contains(text(),'Register')]");

	By firstnameregister = By.id("customer.firstName");

	By lastnameregister = By.id("customer.lastName");

	By addressregister = By.id("customer.address.street");

	By cityregister = By.id("customer.address.city");

	By stateregister = By.id("customer.address.state");

	By zipcoderegister = By.id("customer.address.zipCode");

	By phonenoregister = By.id("customer.phoneNumber");

	By ssnresgiter = By.id("customer.ssn");

	By usernameresgiter = By.id("customer.username");

	By passwordregister = By.id("customer.password");

	By repeatpassword = By.id("repeatedPassword");

	By registerbutton = By.xpath("//input[@value='Register']");

	By registermsg = By.xpath("//div[@id='rightPanel']/p");

	By usernamelog = By.xpath("//input[@name='username']");

	By passwordlog = By.xpath("//input[@name='password']");

	By login = By.xpath("//input[@value='Log In']");

	By logout = By.xpath("//a[contains(text(),'Log Out')]");

	public void RegisterButtonHome() {

		driver.findElement(registerbuttonhome).click();
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)",
		// registerbutton);

	}

	public void FirstName(String fname) {
		driver.findElement(firstnameregister).sendKeys(fname);
	}

	public void LastName(String lname) {
		driver.findElement(lastnameregister).sendKeys(lname);
	}

	public void Address(String add) {
		driver.findElement(addressregister).sendKeys(add);
	}

	public void City(String city) {
		driver.findElement(cityregister).sendKeys(city);
	}

	public void State(String state) {
		driver.findElement(stateregister).sendKeys(state);
	}

	public void ZipCode(String zpc) {
		driver.findElement(zipcoderegister).sendKeys(zpc);
	}

	public void PhoneNumber(String pno) {
		driver.findElement(phonenoregister).sendKeys(pno);
	}

	public void SSN(String ssn) {
		driver.findElement(ssnresgiter).sendKeys(ssn);
	}

	public void UserName(String uname) {
		driver.findElement(usernameresgiter).sendKeys(uname);
	}

	public void Password(String pass) {
		driver.findElement(passwordregister).sendKeys(pass);
	}

	public void RepeatPassword(String rpass) {
		driver.findElement(repeatpassword).sendKeys(rpass);
	}

	public void RegisterButton() {
		driver.findElement(registerbutton).click();
	}

	public void UserNameLog(String unamelog) {
		driver.findElement(usernamelog).sendKeys(unamelog);
	}

	public void PasswordLog(String passlog) {
		driver.findElement(passwordlog).sendKeys(passlog);
	}

	public void Login() {
		driver.findElement(login).click();
	}

	public void logOut() {
		driver.findElement(logout).click();
	}

	By openaccount = By.linkText("Open New Account");

	public void OpenAccount() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(openaccount).click();
	}

	By accounttype = By.id("type");

	public void CheckedAccount() {
		Select checked = new Select(driver.findElement(accounttype));
		checked.selectByVisibleText("CHECKING");
	}

	public void SavingsAccount() {
		Select checked = new Select(driver.findElement(accounttype));
		checked.selectByVisibleText("SAVINGS");
	}

	By openaccountbtn = By.xpath("//input[@value='Open New Account']");

	public void OpenAccountButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(openaccountbtn).click();
	}

	By sucessaccountmsg = By.xpath("//p[contains(text(),'Congratulations, your account is now open.')]");

	public void CheckingMsg() {
		System.out.println("OpenCheckedAccount : " + driver.findElement(sucessaccountmsg).getText());
	}

	public void SavingsMsg() {
		System.out.println("OpenSavingsAccount : " + driver.findElement(sucessaccountmsg).getText());
	}

	By tranfserfunds = By.linkText("Transfer Funds");

	public void TransferFund() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(tranfserfunds).click();
	}

	By transferamount = By.id("amount");

	public void TransferAmount(String amm) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(transferamount).sendKeys(amm);
	}

	By transferfromamount = By.id("fromAccountId");

	By transfertoamount = By.id("toAccountId");

	public void SelectTransferAccount() throws InterruptedException {
		Thread.sleep(4000);
		Select from = new Select(driver.findElement(transferfromamount));
		from.selectByIndex(0);

		Select to = new Select(driver.findElement(transfertoamount));
		to.selectByIndex(1);
	}

	By transferbtn = By.xpath("//input[@value='Transfer']");

	public void Transfer() {
		driver.findElement(transferbtn).click();
	}

	By transferresult = By.xpath("//div[@ng-if='showResult']");

	public void TransferMsg() {
		System.out.println();
		System.out.println("TransferFunds : " + driver.findElement(transferresult).getText());
		System.out.println("");

	}

	By billpay = By.linkText("Bill Pay");

	public void BillPay() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(billpay).click();
	}

	By billpayeename = By.xpath("//input[@name='payee.name']");

	public void PayeeName(String billname) {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(sendpayment));

		driver.findElement(billpayeename).sendKeys(billname);
	}

	By billpayeeaddress = By.xpath("//input[@name='payee.address.street']");

	public void PayeeAddress(String add) {
		driver.findElement(billpayeeaddress).sendKeys(add);
	}

	By billpayeecity = By.xpath("//input[@name='payee.address.city']");

	public void PayeeCity(String city) {
		driver.findElement(billpayeecity).sendKeys(city);
	}

	By billpayeestate = By.xpath("//input[@name='payee.address.state']");

	public void PayeeState(String state) {
		driver.findElement(billpayeestate).sendKeys(state);
	}

	By billpayeezipcode = By.xpath("//input[@name='payee.address.zipCode']");

	public void PayeeZipCode(String zpc) {
		driver.findElement(billpayeezipcode).sendKeys(zpc);
	}

	By payephoneno = By.xpath("//input[@name='payee.phoneNumber']");

	public void PayeePhoneNumber(String pno) {
		driver.findElement(payephoneno).sendKeys(pno);
	}

	By payeeaccountno = By.xpath("//input[@name='payee.accountNumber']");

	public void PayeeAccountNo(String paccno) {
		driver.findElement(payeeaccountno).sendKeys(paccno);
	}

	By payeeverifyaccountno = By.xpath("//input[@name='verifyAccount']");

	public void PayeeVerifyAccountNo(String pvno) {
		driver.findElement(payeeverifyaccountno).sendKeys(pvno);
	}

	By payeeamount = By.xpath("//input[@name='amount']");

	public void PayeeAmount(String amm) {
		driver.findElement(payeeamount).sendKeys(amm);
	}

	By payeefromacc = By.xpath("//select[@name='fromAccountId']");

	public void PayeeFromAccount() throws InterruptedException {
		Thread.sleep(3000);
		Select payeefrom = new Select(driver.findElement(payeefromacc));
		payeefrom.selectByIndex(0);
	}

	By sendpayment = By.xpath("//input[@value='Send Payment']");

	public void SendPayment() {
		driver.findElement(sendpayment).click();
	}

	By billpaymsg = By.xpath("//div[@ng-show='showResult']");

	public void BillPayMsg() {
		System.out.println("");
		System.out.println("BillPay : " + driver.findElement(billpaymsg).getText());
		System.out.println("");

	}

	By transcations = By.linkText("Find Transactions");

	public void FindTransactionsLink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(transcations).click();
	}

	By accountidtrans = By.id("accountId");

	public void SelectTranscationAccount() {

		Select accid = new Select(driver.findElement(accountidtrans));
		accid.selectByIndex(0);
	}

	By transcationdate = By.id("criteria.onDate");

	public void FindTranscationByDate(String dt) {
		driver.findElement(transcationdate).sendKeys(dt);
	}

	By findtranscationdatebtn = By.xpath("//button[contains(@ng-click,'DATE')]");

	public void FindTransactionDate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(findtranscationdatebtn).click();
	}

	By findtransdatemsg = By.xpath("//div[@ng-if='showResult']");

	public void FindTranscationDateMsg() {

		System.out.println("");
		System.out.println("FindTranscationsByDate : " + driver.findElement(findtransdatemsg).getText());
		System.out.println("");
	}

	By betweentransdate = By.id("criteria.fromDate");

	public void BetweenDateRange(String bdr) {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(findtranscationdatebtn));
		driver.findElement(betweentransdate).sendKeys(bdr);
	}

	By andtransdate = By.id("criteria.toDate");

	public void AndDateRange(String adr) {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(findtranscationdatebtn));
		driver.findElement(andtransdate).sendKeys(adr);
	}

	By findtranscationdaterangebtn = By.xpath("//button[contains(@ng-click,'DATE_RANGE')]");

	public void FindTransactionDateRange() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(findtranscationdaterangebtn).click();
	}

	By findamounttrans = By.id("criteria.amount");

	public void FindTranscationAmount(String ammfind) {
		driver.findElement(findamounttrans).sendKeys(ammfind);
	}

	By findtransacationsamountbtn = By.xpath("//button[contains(@ng-click,'AMOUNT')]");

	public void FindTransactionAmountButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(findtransacationsamountbtn).click();
	}

	By amounttransmsg = By.xpath("//div[@ng-if='showResult']");

	public void AmountTranscationMsg() {
		System.out.println("");
		System.out.println("FindTranscationsByAmount : " + driver.findElement(amounttransmsg).getText());
	}

	By updatecontact = By.linkText("Update Contact Info");

	public void UpdateContactLink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(updatecontact).click();
	}

	By updatefname = By.id("customer.firstName");

	public void UpdateFirstName(String ufname) {
		driver.findElement(updatefname).sendKeys(ufname);
	}

	By updatelname = By.id("customer.lastName");

	public void UpdateLastName(String ulname) {
		driver.findElement(updatelname).sendKeys(ulname);
	}

	By updateaddress = By.id("customer.address.street");

	public void UpdateAddress(String uadd) {
		driver.findElement(updateaddress).sendKeys(uadd);
	}

	By updatecity = By.id("customer.address.city");

	public void UpdateCity(String ucity) {
		driver.findElement(updatecity).sendKeys(ucity);
	}

	By updatestate = By.id("customer.address.state");

	public void UpdateState(String ustate) {
		driver.findElement(updatestate).sendKeys(ustate);
	}

	By updatezpc = By.id("customer.address.zipCode");

	public void UpdateZipCode(String uzpc) {
		driver.findElement(updatezpc).sendKeys(uzpc);
	}

	By updatepno = By.id("customer.phoneNumber");

	public void UpdatePhone(String upno) {
		driver.findElement(updatepno).sendKeys(upno);
	}

	By updatebtn = By.xpath("//input[contains(@value,'Update')]");

	public void UpdateButton() {
		driver.findElement(updatebtn).click();
	}

	By updatemsg = By
			.xpath("//p[contains(text(),'Your updated address and phone number have been added to the system.')]");

	public void UpdatedMsg() {
		System.out.println("UpdateContactInfo : " + driver.findElement(updatemsg).getText());
		System.out.println("");
	}

	By requestloan = By.linkText("Request Loan");

	public void RequestLoanLink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(requestloan).click();
	}

	By loanamount = By.id("amount");

	public void LoanAmount(String amm) {
		driver.findElement(loanamount).sendKeys(amm);
	}

	By downpayment = By.id("downPayment");

	public void DownPayment(String dp) {
		driver.findElement(downpayment).sendKeys(dp);
	}

	By loanselectaccount = By.id("fromAccountId");

	public void SelectAccountLoan() {

		Select accidlo = new Select(driver.findElement(loanselectaccount));
		accidlo.selectByIndex(0);
	}

	By applyloanbutton = By.xpath("//input[@value='Apply Now']");

	public void LoanApplyButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(applyloanbutton).click();
	}

	By loanmsg = By.xpath("//div[@ng-if='showResult']");

	public void LoanMessage() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("RequestLoan : " + driver.findElement(loanmsg).getText());

	}

}
