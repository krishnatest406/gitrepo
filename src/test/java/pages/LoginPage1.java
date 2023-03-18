package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LoginPage1 {

	public RemoteWebDriver driver;
//	public FluentWait<RemoteWebDriver> wait;
	
	@FindBy(xpath="//input[@id='identifierId']") 
	private WebElement emailOrPhone;

	@FindBy(xpath="//input[@type='password']") 
	private WebElement enterYourPassword;
	
	@FindBy(xpath="//span[text()='Next']") 
	private WebElement next;

	@FindBy(xpath="//div[contains(text(),'Compose')]") 
	private WebElement compose;
	
	public LoginPage1(RemoteWebDriver driver){
		AjaxElementLocatorFactory aj=new AjaxElementLocatorFactory(driver,40);
		PageFactory.initElements(aj,this);
		this.driver=driver;
//		this.wait=wait;
	}
	
	public void emailOrPhoneField(String un) throws Exception {
//		wait.until(ExpectedConditions.visibilityOf(emailOrPhone)).sendKeys(un);
		emailOrPhone.sendKeys(un);
	}
	public void nextBtn() throws Exception {
	//	wait.until(ExpectedConditions.elementToBeClickable(next)).click();
		next.click();
	}
	public void enterYourPasswordField(String pw) throws Exception {
//		wait.until(ExpectedConditions.visibilityOf(enterYourPassword)).sendKeys(pw);
		enterYourPassword.sendKeys(pw);
	}
	public boolean composeField() throws Exception {
		return compose.isDisplayed();
//		return wait.until(ExpectedConditions.visibilityOf(compose)).isDisplayed();
	}

}
