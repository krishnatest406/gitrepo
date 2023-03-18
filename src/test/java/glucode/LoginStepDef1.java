package glucode;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage1;
import utility.WebSiteUtility;

public class LoginStepDef1 {
	public RemoteWebDriver driver;
	public Scenario s;
    public LoginPage1 lp;
    public BaseClass bc;
    public WebSiteUtility wu;
 //   public FluentWait<RemoteWebDriver> wait;
	
    public LoginStepDef1(BaseClass bc) {
		this.bc=bc;
	}
    
	@Given("open browser")
	public void openBrowser()  {
		wu=new WebSiteUtility();
	    bc.driver=wu.launchBrowser("firefox");
		bc.driver.manage().window().maximize();
		bc.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));	
	}	
	@When("launch {string} site")
	public void openSite(String url) throws Exception {
		wu=new WebSiteUtility();
		wu.launchSite(bc.driver, url);
	}
	@And ("enter userId as {} and click on next button")
	public void userfield(String uname) throws Exception {
		
		lp=new LoginPage1(bc.driver);
		Thread.sleep(3000);
		lp.emailOrPhoneField(uname);
		Thread.sleep(2000);
		lp.nextBtn();
		Thread.sleep(2000);
	}
	@And("enter password as {} and click on next button")
	public void passfield(String pword) throws Exception {
	
		lp=new LoginPage1(bc.driver);
		Thread.sleep(3000);
		lp.enterYourPasswordField(pword);
		Thread.sleep(1000);
		lp.nextBtn();
		Thread.sleep(2000);
		
	}
	
	@Then("check the composite btn is displayed or not")
	public void loginValidate() throws IOException, Exception {
		
		try {
			lp=new LoginPage1(bc.driver);
			Thread.sleep(5000);
			lp.composeField();
			System.out.println("valid user");
		}
		catch(Exception e) {
			System.out.println("In-valid user");
			
		}
	}

}
