package glucode;


import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import utility.WebSiteUtility;


public class LoginStepDef2 {
	public RemoteWebDriver driver;	 
	public BaseClass bc;
    public WebSiteUtility wu;
    public LoginPage lp;
    
	public LoginStepDef2(BaseClass bc) {
		this.bc=bc;
	}
	@And("login the application with username as {} and pw {} and click on enter btn")
	public void login1(String un,String pw) throws Exception {
	
		lp=new LoginPage(bc.driver);
		Thread.sleep(4000);
		lp.login_username(un);
		lp.login_password(pw);
		Thread.sleep(1000);
		lp.logIn_btn();
		
	}
	@And("get account details")
	public void account_details() throws Exception {
	
		lp=new LoginPage(bc.driver);
		Thread.sleep(4000);
		System.out.println("Account number is :"+lp.acc_Num());
		System.out.println("Total amount is :"+lp.total_Amount());
		
	}
	
	@And("go to fund transfer menu and enter money and select sender and reciver details and click on transfer btn")
	public void money_Transfer() throws Exception {
	
		lp=new LoginPage(bc.driver);
		Thread.sleep(4000);
		lp.fundTransferTab();
		Thread.sleep(1000);
		lp.amount_Feild("500");
		Thread.sleep(1000);
		lp.from_Feild();
		Thread.sleep(1000);
		lp.to_Feild();
		Thread.sleep(1000);
		lp.transfer_btn();
	}
		
	@Then("check the money is transfered or not")
	public void money_Transfer_check() throws Exception {
		lp=new LoginPage(bc.driver);
		Thread.sleep(2000);
		if(lp.check_Transaction()) {
			System.out.println("transcation done");
		}else {
			System.out.println("transcation failed");
		}
		
	}
	@When("close the site")
	public void closeSite() throws Exception {
		Thread.sleep(4000);
		wu=new WebSiteUtility();
		wu.closeSite(bc.driver);
	}
	
}
