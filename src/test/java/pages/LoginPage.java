package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public RemoteWebDriver driver;

	@FindBy(xpath="//input[@name='username']") 
	private WebElement loginusername;

	@FindBy(xpath="//input[@name='password']") 
	private WebElement loginpassword;

	@FindBy(xpath="//input[@value='Log In']") 
	private WebElement logIn;

	@FindBy(xpath="//table[@id='accountTable']/tbody/tr[1]/td[1]/a") 
	private WebElement accNum;

	@FindBy(xpath="//table[@id='accountTable']/tbody/tr[2]/td[2]/b") 
	private WebElement totalAmount;

	@FindBy(xpath="//a[text()='Transfer Funds']") 
	private WebElement fundTransfer;

	@FindBy(xpath="//input[@id='amount']") 
	private WebElement amountFeild;

	@FindBy(xpath="//select[@id='fromAccountId']") 
	private WebElement fromFeild;

	@FindBy(xpath="//select[@id='toAccountId']") 
	private WebElement toFeild;

	@FindBy(xpath="//input[@value='Transfer']") 
	private WebElement transferbtn;
	
	@FindBy(xpath="//h1[text()='Transfer Complete!']") 
	private WebElement checkTransaction;

	public LoginPage(RemoteWebDriver driver){
		AjaxElementLocatorFactory aj=new AjaxElementLocatorFactory(driver,40);
		PageFactory.initElements(aj,this);
		this.driver=driver;
	}


	public void login_username(String un) {
		loginusername.sendKeys(un);
	}
	public void login_password(String pw) {
		loginpassword.sendKeys(pw);
	}

	public void logIn_btn() {
		logIn.click();
	}
	public String acc_Num() {
		return accNum.getText();
	}
	public String total_Amount() {
		return totalAmount.getText();
	}
	public void fundTransferTab() {
		fundTransfer.click();
	}
	public void amount_Feild(String am) {
		amountFeild.sendKeys(am);
	}
	public void from_Feild() {
		Select s=new Select(fromFeild);
		s.selectByIndex(0);
	}
	public void to_Feild() {
		Select s=new Select(toFeild);
		s.selectByIndex(0);
	}
	public void transfer_btn() {
		transferbtn.click();
	}
	public boolean check_Transaction() {
		return checkTransaction.isDisplayed();
	}

}
