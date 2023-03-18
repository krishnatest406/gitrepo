package glucode;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;
import utility.WebSiteUtility;

public class LoginStepDef1 {
	public RemoteWebDriver driver;
	public Scenario s;
    public SignupPage su;
    public BaseClass bc;
    public WebSiteUtility wu;
 //   public FluentWait<RemoteWebDriver> wait;
	
    public LoginStepDef1(BaseClass bc) {
		this.bc=bc;
	}
    
	@Given("open browser")
	public void openBrowser()  {
		wu=new WebSiteUtility();
	    bc.driver=wu.launchBrowser("edge");
		bc.driver.manage().window().maximize();
		bc.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));	
	}	
	@When("launch {string} site")
	public void openSite(String url) throws Exception {
		wu=new WebSiteUtility();
		wu.launchSite(bc.driver, url);
	}
	@And ("enter firstName {} and lastName {}")
	public void reg1(String uname,String lname) throws Exception {
		
		su=new SignupPage(bc.driver);
		Thread.sleep(3000);
		su.first_Name(uname);
		su.last_Name(lname);
	}
	@And("enter address as {} and city {} and state {}")
	public void reg2(String vlg,String cty,String st) throws Exception {
	
		su=new SignupPage(bc.driver);
		Thread.sleep(1000);
		su.address_vlg(vlg);
		su.city_Name(cty);
		su.state_Name(st);
		
	}
	@And("enter zip as {} and phNum {} and ssn {}")
	public void reg3(String zp,String pno,String ssnNo) throws Exception {
	
		su=new SignupPage(bc.driver);
		Thread.sleep(1000);
		su.zip_Code(zp);
		su.phone_Number(pno);
		su.ssn_Number(ssnNo);
		
	}
	@And("enter username as {} and pw {} and click on enter btn")
	public void reg4(String un,String pw) throws Exception {
	
		su=new SignupPage(bc.driver);
		Thread.sleep(1000);
		su.user_name(un);
		su.pass_word(pw);
		su.repeated_Password(pw);
		Thread.sleep(1000);
		su.register_btn();
		
	}
	@Then("check the welcome msg is displayed or not")
	public void loginValidate() throws IOException, Exception {
		
		try {
			su=new SignupPage(bc.driver);
			Thread.sleep(5000);
			if(su.welcome_page()) {
				System.out.println("valid user");
			}
		}
		catch(Exception e) {
			System.out.println("In-valid user");
			
		}
	}
	@When("click on logout btn")
	public void logout() throws Exception {
		su=new SignupPage(bc.driver);
		Thread.sleep(3000);
		su.logOut_btn();
	}
	
}
