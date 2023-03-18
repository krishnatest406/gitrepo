package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignupPage {

	public RemoteWebDriver driver;

	@FindBy(xpath="//input[contains(@id,'firstName')]") 
	private WebElement firstName;
	@FindBy(xpath="//input[contains(@id,'lastName')]") 
	private WebElement lastName;
	@FindBy(xpath="//input[contains(@id,'street')]") 
	private WebElement address;
	@FindBy(xpath="//input[contains(@id,'city')]") 
	private WebElement city;
	@FindBy(xpath="//input[contains(@id,'state')]") 
	private WebElement state;
	@FindBy(xpath="//input[contains(@id,'zipCode')]") 
	private WebElement zipCode;
	@FindBy(xpath="//input[contains(@id,'phoneNumber')]") 
	private WebElement phoneNumber;
	@FindBy(xpath="//input[contains(@id,'ssn')]") 
	private WebElement ssn;
	@FindBy(xpath="//input[contains(@id,'username')]") 
	private WebElement username;
	@FindBy(xpath="//input[contains(@id,'password')]") 
	private WebElement password;
	@FindBy(xpath="//input[@id='repeatedPassword']") 
	private WebElement repeatedPassword;
	@FindBy(xpath="//input[@value='Register']") 
	private WebElement register;
	@FindBy(xpath="//h1[@class='title']") 
	private WebElement welcomepage;
	@FindBy(xpath="//a[normalize-space()='Log Out']") 
	private WebElement logOut;
	
	public SignupPage(RemoteWebDriver driver){
		AjaxElementLocatorFactory aj=new AjaxElementLocatorFactory(driver,40);
		PageFactory.initElements(aj,this);
		this.driver=driver;
	}

	public void first_Name(String fn) {
		firstName.sendKeys(fn);
	}
	public void last_Name(String ln) {
		lastName.sendKeys(ln);
	}
	public void address_vlg(String adr) {
		address.sendKeys(adr);
	}
	public void city_Name(String ct) {
		city.sendKeys(ct);
	}
	public void state_Name(String st) {
		state.sendKeys(st);
	}
	public void zip_Code(String zip) {
		zipCode.sendKeys(zip);
	}
	public void phone_Number(String pn) {
		phoneNumber.sendKeys(pn);
	}
	public void ssn_Number(String s) {
		ssn.sendKeys(s);
	}
	public void user_name(String un) {
		username.sendKeys(un);
	}
	public void pass_word(String pw) {
		password.sendKeys(pw);
	}
	public void repeated_Password(String rp) {
		repeatedPassword.sendKeys(rp);
	}
	public void register_btn() {
		register.click();
	}
	public boolean welcome_page() {
		return welcomepage.isDisplayed();
	}
	public void logOut_btn() {
		logOut.click();
	}
}
