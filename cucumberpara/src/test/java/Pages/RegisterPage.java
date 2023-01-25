package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

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
	
	public RegisterPage(WebDriver driver) {
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
	
	By validregistermsg  = By.xpath("//div[@id='rightPanel']/p");
	
	public void ValidRegisterMsg()
	{
		System.out.println();
		System.out.println("Registration With Valid Details : "+driver.findElement(validregistermsg).getText());
		System.out.println();

	}
	
	By invalidregistermsg = By.id("customer.ssn.errors");
	
	public void InvalidRegisterMsg()
	{
		System.out.println();
		System.out.println("Registration With InValid Details : "+driver.findElement(invalidregistermsg).getText());
		System.out.println();

	}
	
	By emptyerrormsg= By.id("customer.firstName.errors");
	
	public void EmptyRegisterMsg()
	{
		System.out.println();
		System.out.println("Registration With Empty Fields : "+driver.findElement(emptyerrormsg).getText());
		System.out.println();

	}
	
	
	
}
