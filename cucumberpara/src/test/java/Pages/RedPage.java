package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedPage {

	WebDriver driver;
	JavascriptExecutor js;

	public RedPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;

	}

	By aboutus = By.xpath("//a[contains(text(),'About')]");

	public void about() {
		driver.findElement(aboutus).click();

	}

	public void AboutRedirect() {
		if (driver.getTitle().contains("About Us")) {
			System.out.println("About Us Link is RedirectAble");
		} else {
			System.out.println("About Us Link is Not RedirectAble");

		}
	}

	By products = By.xpath("//a[contains(text(),'Products')]");

	public void Product() {
		driver.findElement(products).click();

	}

	public void ProductsRedirect() {
		if (driver.getCurrentUrl().contains("products")) {
			System.out.println("Products Link is RedirectAble");
			System.out.println("");
		} else {
			System.out.println("Products Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By location = By.xpath("//a[contains(text(),'Location')]");

	By paraloclogo = By.xpath("//a[@title='parasoft']//img");

	public void Location() {
		driver.findElement(location).click();

	}

	public void LocationRedirect() {
		System.out.println("Title of Location Page:" + driver.getTitle());

		if (driver.findElement(paraloclogo).isDisplayed()) {
			System.out.println("Location Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("Location Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By bookstore = By.xpath("//a[contains(text(),'Services')]");

	By bookstorelink = By.linkText("{http://store.parabank.parasoft.com/}Bookstore");

	public void BookStore() {
		driver.findElement(bookstore).click();
		driver.findElement(bookstorelink).click();
	}

	public void BookStoreRedirect() {
		if (driver.getCurrentUrl().contains("store")) {
			System.out.println("BookStore Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("BookStore Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By loanprocessor = By.xpath("//a[contains(text(),'{http://service.parabank.parasoft.com/}LoanProcess')]");

	public void LoanProcessor() {
		driver.findElement(bookstore).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)",driver.findElement(loanprocessor));
		driver.findElement(loanprocessor).click();
	
	}

	public void LoanProcessorRedirect() {

		if (driver.getCurrentUrl().contains("LoanProcessor")) {
			System.out.println("LoanProcessor Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("LoanProcessor Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By parabank = By.xpath("//a[contains(text(),'{http://service.parabank.parasoft.com/}ParaBank')]");

	public void Parbank() {
		driver.findElement(bookstore).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(parabank));
		driver.findElement(parabank).click();
	}

	public void ParabankRedirect() {

		if (driver.getCurrentUrl().contains("ParaBank")) {
			System.out.println("ParaBank Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("ParaBank Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By wadl = By.xpath("//a[contains(text(),'https://parabank.parasoft.com/parabank/services/ba')]");

	public void WADL() {
		driver.findElement(bookstore).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(wadl));
		driver.findElement(wadl).click();
	}

	public void WADLRedirect() {

		if (driver.getCurrentUrl().contains("wadl")) {
			System.out.println("WADL Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("WADL Link is Not RedirectAble");
			System.out.println("");

		}
	}

	By swagger = By.xpath("//a[contains(text(),'https://parabank.parasoft.com/parabank/api-docs/in')]");

	public void Swagger() {
		driver.findElement(bookstore).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", driver.findElement(wadl));
		driver.findElement(swagger).click();
	}

	public void SwaggerRedirect() {

		if (driver.getTitle().contains("Swagger")) {
			System.out.println("Swagger Link is RedirectAble");
			System.out.println("");

		} else {
			System.out.println("Swagger Link is Not RedirectAble");
			System.out.println("");

		}
	}
}
