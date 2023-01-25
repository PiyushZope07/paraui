package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FindLoginInfoPage {
	
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
	
	By logout = By.xpath("//a[contains(text(),'Log Out')]");
	 
	By forgotlogin = By.xpath("//a[contains(text(),'Forgot')]");
	
	By findfname = By.id("firstName");
	
	By findlname = By.id("lastName");
	
	By findaddress = By.id("address.street");
	
	By findcity = By.id("address.city");
	
	By findstate = By.id("address.state");
	
	By findzipcode= By.id("address.zipCode");
	
	By findssn= By.id("ssn");
	
	By findlogininfo= By.xpath("//input[@value='Find My Login Info']");
	
	By emptyerror  = By.cssSelector("p[class='error']");
	
	
	public void EmptyErrorMessage() {
		System.out.println("Find Login EF : "+driver.findElement(emptyerror).getText());
	}
	public FindLoginInfoPage(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		
	}
	
	public void RegisterButtonHome() {

		driver.findElement(registerbuttonhome).click();
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)", registerbutton);

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
	
	public void logOut() {
		driver.findElement(logout).click();
	}
	
	public void ForgotLoginInfo() {
		driver.findElement(forgotlogin).click();
	}
	
	public void Findfname(String fname) {
		driver.findElement(findfname).sendKeys(fname);
	}
	
	public void FindLname(String lname) {
		driver.findElement(findlname).sendKeys(lname);
	}
	
	public void FindAddress(String add) {
		driver.findElement(findaddress).sendKeys(add);
	}
	
	public void FindCity(String city) {
		driver.findElement(findcity).sendKeys(city);
	}
	
	public void FindState(String state) {
		driver.findElement(findstate).sendKeys(state);
	}
	
	public void FindZipCode(String zpc) {
		driver.findElement(findzipcode).sendKeys(zpc);
	}
	
	public void FindSSN(String ssn) {
		driver.findElement(findssn).sendKeys(ssn);
	}
	
	public void FindLoginInfo() {
		driver.findElement(findlogininfo).click();
	}
	
	By validfindmyloginmsg = By.xpath("//p[contains(text(),'Your login information was located successfully. Y')]");
	
	public void ValidFindMyLoginMsg() {
		System.out.println();
		System.out.println("FindLoginDetailsWithValidDetails : "+driver.findElement(validfindmyloginmsg).getText());
		System.out.println();

	}
	
	By invalidfindmyloginmsg= By.cssSelector("p[class='error']");
	
	public void InvalidFindMyLoginMsg() {
		System.out.println();
		System.out.println("FindLoginDetailsWithInvalidDetails : "+driver.findElement(invalidfindmyloginmsg).getText());
		System.out.println();

	}
	
	By emptyfindmyloginmsg= By.id("firstName.errors");
	
	public void EmptyFindMyLoginMsg() {
		System.out.println();
		System.out.println("FindLoginDetailsWithEmpyFields : "+driver.findElement(emptyfindmyloginmsg).getText());
		System.out.println();

	}
	
}
