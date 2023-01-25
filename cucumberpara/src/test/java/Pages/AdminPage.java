package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	WebDriver driver;
	JavascriptExecutor js;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
	}

	By adminlink = By.xpath("//a[contains(text(),'Admin Page')]");

	public void AdminLink() {
		driver.findElement(adminlink).click();

	}

	By initializebtn = By.xpath("//button[contains(text(),'Initialize')]");

	public void AdminDatabaseInitializeBtn() {
		driver.findElement(initializebtn).click();
	}

	By initializemsg = By.xpath("//b[contains(text(),'Database Initialized')]");

	public void AdminDatabaseInitializeMsg() {
		System.out.println();
		System.out.println("AdminDatabaseInitialize : " + driver.findElement(initializemsg).getText());
		System.out.println();

	}

	By cleanbtn = By.xpath("//button[contains(text(),'Clean')]");

	public void AdminDatabaseCleanBtn() {
		driver.findElement(cleanbtn).click();
	}

	By cleanmsg = By.xpath("//b[contains(text(),'Database Cleaned')]");

	public void AdminDatabaseCleanMsg() {
		System.out.println();
		System.out.println("AdminDatabaseCleaned : " + driver.findElement(cleanmsg).getText());
		System.out.println();

	}

	By shutdownbtn = By.xpath("//input[@value='Shutdown']");

	public void AdminBatabaseShutdownbtn() {
		driver.findElement(shutdownbtn).click();
	}

	By shutdownmsg = By.xpath("//td[contains(text(),'Stopped')]");

	public void AdminDatabaseShutDownMsg() {
		System.out.println();
		System.out.println("JMSService ShutDown Status : " + driver.findElement(shutdownmsg).getText());
		System.out.println();

	}

	By startupbtn = By.xpath("//input[@value='Startup']");

	public void AdminBatabasestartupbtn() {
		driver.findElement(startupbtn).click();
	}

	By startupmsg = By.xpath("//td[contains(text(),'Running')]");

	public void AdminDatabasestartupMsg() {
		System.out.println();
		System.out.println("JMSService startup Status : " + driver.findElement(startupmsg).getText());
		System.out.println();

	}

	By soapcheckbox = By.id("accessMode1");

	public void SOAP() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(soapcheckbox));

		if (driver.findElement(soapcheckbox).isEnabled()) {
			driver.findElement(soapcheckbox).click();
		}
		System.out.println("");
	}
	public void SOAPValidate() {

		if (driver.findElement(soapcheckbox).isEnabled()) {
			System.out.println("SOAP CHECKBOX ENABLED:" + driver.findElement(soapcheckbox).isEnabled());
		}
		System.out.println("");
	}
	

	By restxml = By.id("accessMode2");
	
	public void RestXML() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(soapcheckbox));

		if (driver.findElement(restxml).isEnabled()) {
			driver.findElement(restxml).click();
		}
		System.out.println("");
	}
	
	public void RestXMLValidate() {
		if (driver.findElement(restxml).isEnabled()) {
			System.out.println("REST-XML CHECKBOX ENABLED:" + driver.findElement(restxml).isEnabled());
		}
		System.out.println("");
	}
	
	
	
	

	By restjson = By.id("accessMode3");

	
	public void RestJSON() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(soapcheckbox));

		if (driver.findElement(restjson).isEnabled()) {
			driver.findElement(restjson).click();
		}
		System.out.println("");
	}
	
	public void RestJSONValidate() {
		if (driver.findElement(restjson).isEnabled()) {
			System.out.println("REST-JSON CHECKBOX ENABLED:" + driver.findElement(restjson).isEnabled());
	}
		System.out.println("");
	}
	By jdbc = By.id("accessMode4");
	
	public void JDBC() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(soapcheckbox));

		if (driver.findElement(jdbc).isEnabled()) {
			driver.findElement(jdbc).click();
		}
		System.out.println("");
	}
	
	public void JDBCValidate() {
		if (driver.findElement(jdbc).isEnabled()) {
			System.out.println("JDBC CHECKBOX ENABLED:" + driver.findElement(jdbc).isEnabled());
		}
		System.out.println("");
	}
	
	
	By initbalance = By.id("initialBalance");
	
	public void SetInitBal(String initbal)
	{
		driver.findElement(initbalance).clear();
		driver.findElement(initbalance).sendKeys(initbal);
	}
	
	By minbalance = By.id("minimumBalance");
	
	public void SetMinBal(String minbal)
	{
		driver.findElement(minbalance).clear();
		driver.findElement(minbalance).sendKeys(minbal);
	}
	
	
	By loanprovider = By.id("loanProvider");
	
	public void LoanProviderDropDown() {
		Select loanproviderdropdown = new Select(driver.findElement(loanprovider));
		loanproviderdropdown.selectByVisibleText("JMS");
	}
	
	By loanprocessor = By.id("loanProcessor");
	
	
	public void LoanProcessorDropdown() {

		Select loanprocessordropdown = new Select(driver.findElement(loanprocessor));
		loanprocessordropdown.selectByVisibleText("Available Funds");

	}
	
	
	By threshold=By.id("loanProcessorThreshold");
	

	public void Threshold(String thresh) {
		driver.findElement(threshold).clear();
		driver.findElement(threshold).sendKeys(thresh);

	}
	
	By submit= By.xpath("//input[@value='Submit']");
	
	public void Submit() {
		driver.findElement(submit).click();
	}
	
	By settingmsg= By.xpath("//b[contains(text(),'Settings saved successfully.')]");
	
	public void SettingsMsg() {
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(settingmsg));

		System.out.println("AdminSettings : " + driver.findElement(settingmsg).getText());
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
