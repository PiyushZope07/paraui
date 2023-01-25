package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	JavascriptExecutor js;

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

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;

	}

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

	public void LogOutPresent() {
		if (driver.findElement(logout).isDisplayed()) {
			
			System.out.println("Login With Valid Details : Login Sucessfull");
		} else {
			System.out.println("Login With Valid Details : Login Unsucessfull");
		}
	}

	By invalidloginmsg = By.xpath("//div[@id='rightPanel']");

	public void InvalidLoginMsg() {
		System.out.println("Login With Invalid Details : " + driver.findElement(invalidloginmsg).getText());
	}

	public void EmptyFieldsLoginMsg() {
		System.out.println("Login With Empty Fields : " + driver.findElement(invalidloginmsg).getText());

	}
}
